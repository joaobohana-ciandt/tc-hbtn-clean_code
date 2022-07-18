public class Functions{
  //B
    public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

   //A
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }

   //A
    public void saveUser(User user){};

   //B
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);
    }

   //B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){
        return versionService.getVersion();
    }
    

}

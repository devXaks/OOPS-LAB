class ExceptionHandling {
    static class myException extends Exception {
        public String toString(){
            return "myException";
        }
    }
    public static void main(String[] args) {
        try {
            if(5==5){
                throw new myException();
            }
        } catch (myException e) {
            System.out.println(e);
        }
    }
}
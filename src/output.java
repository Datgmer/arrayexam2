public class output {
    public Boolean status;
    public String message;
    public String content;
    public output(){
        Boolean status;
        String message;
        String content;
    }

    @Override
    public String toString() {
        return "output{" +
                " \nstatus=" + status +
                ",\n message='" + message + '\'' +
                ",\n content='" + content + '\'' +
                "\n}";
    }
}

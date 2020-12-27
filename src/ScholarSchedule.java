public class ScholarSchedule {

    private DayOfWeek dayOfWeek;

//...другие поля


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public static void main(String[] args) {
        ScholarSchedule scholarSchedule = new ScholarSchedule();
        scholarSchedule.takeLunch(DayOfWeek.SUNDAY);

    }

    public void takeLunch(DayOfWeek dayOfWeek) {

        switch (dayOfWeek) {

            case SUNDAY:
                System.out.println(dayOfWeek.getTitle());
                break;
            case MONDAY:
                System.out.println(dayOfWeek.getTitle());

                break;
            case TUESDAY:
                System.out.println(dayOfWeek.getTitle());
                break;
//...и так далее до конца

        }


    }
}
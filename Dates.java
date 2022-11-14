public class Dates {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); //1970
        for (long i=0; i<1000_000_000L; i++){

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        LocalDate date = 
LocalDate.now
();
        System.out.println(date);

        LocalTime time = 
LocalTime.now
();
        System.out.println(time);

        LocalDateTime dateTime = 
LocalDateTime.now
();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("dd/MM/yyyy HH🇲🇲ss");
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println(formatted);

        Calendar calendar = new GregorianCalendar();
        calendar.set(2022,10,15);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.HOUR,-100);
        System.out.println(calendar.getTime());

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName()+" "+timeZone.getID());
    }
} 
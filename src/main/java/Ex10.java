public class Ex10 {
    public static String array[] = {"chu nhat", "thu 2", "thu 3", "thu 4",
            "thu 5", "thu 6", "thu 7"};
    public String thu(int ngay, int thang, int nam) {
        if (thang < 3) {
            thang = thang + 12;
            nam = nam - 1;
        }
        int thu = (ngay + 2 * thang + (3 * (thang + 1)) / 5 + nam + (nam / 4)) % 7;
        return array[thu];
    }
}


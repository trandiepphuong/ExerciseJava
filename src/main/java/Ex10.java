public class Ex10 {
    public String thu(int ngay, int thang, int nam) {
        String result="";
        //nam =1900 + (nam%1900);
        if (thang<3) {
            thang=thang+12;
            nam=nam-1;
        }
        int thu =(ngay+2*thang+(3*(thang+1))/5 + nam + (nam/4))%7;
        switch (thu){
            case(0): result = "chu nhat";break;
            case(1): result = "thu hai";break;
            case(2): result = "thu ba";break;
            case(3): result = "thu tu";break;
            case(4): result = "thu nam";break;
            case(5): result = "thu sau";break;
            case(6): result = "thu bay";break;
        }
        return result;
    }
}


public class ReuseEx {
    public static void main(String[] args) {
        President [] chair = new President[5];

        chair[0] = new President("김지윤", "이화여대", "세상은 함께 살아가는 것이다");
        chair[1] = new President("김효진", "서울대", "앞으로 나아가자");
        chair[2] = new President("채인숙", "중앙대", "모두 다함께");
        chair[3] = new President("김지상", "고려대", "내가 제일 중요하다");
        chair[4] = new President("김또비", "연세대");

        chair[0].getInfo();
        chair[1].getInfo();
        chair[2].getInfo();
        chair[3].getInfo();
        chair[4].getInfo();

    }
}

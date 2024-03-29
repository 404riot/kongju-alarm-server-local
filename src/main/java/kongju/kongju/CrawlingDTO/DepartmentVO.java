package kongju.kongju.CrawlingDTO;

public class DepartmentVO {

    String global_kongju = "https://www.kongju.ac.kr/kor/article/student_news/?mno=&pageIndex=1&categoryCnt=1&searchCategory=&searchCategory0=&searchCondition=1&searchKeyword=";

    String ai_kongju = "https://ai.kongju.ac.kr/ZK0120/6358/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkswMTIwJTJGNzQ1JTJGYXJ0Y2xMaXN0LmRvJTNGcGFnZSUzRDElMjZzcmNoQ29sdW1uJTNEJTI2c3JjaFdyZCUzRCUyNmJic0NsU2VxJTNEJTI2YmJzT3BlbldyZFNlcSUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2cmdzRW5kZGVTdHIlM0QlMjZpc1ZpZXdNaW5lJTNEZmFsc2UlMjY%3D";

    String lac_kongju = "https://lac.kongju.ac.kr/ZK0130/10960/subview.do";

    // 사범대학 pageIndex UlM0Qx - y - z - 0 - 1 - 2 - 3 ...
    // x y z 0 1 2 3 ... 형태에서 지정 인덱스 넘어가면 <td class="no-data"> 출력되니까 얘 가지고 마지막 페이지 확인.
    String sabum_kongju = "https://sabum.kongju.ac.kr/ZA0000/1255/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMDAwJTJGMTU2JTJGYXJ0Y2xMaXN0LmRvJTNGcGFnZSUzRDElMjZzcmNoQ29sdW1uJTNEJTI2c3JjaFdyZCUzRCUyNmJic0NsU2VxJTNEJTI2YmJzT3BlbldyZFNlcSUzRCUyNnJnc0JnbmRlU3RyJTNEJTI2cmdzRW5kZGVTdHIlM0QlMjZpc1ZpZXdNaW5lJTNEZmFsc2UlMjY%3D";
    String koredu_kongju = "https://koredu.kongju.ac.kr/ZA0110/9786/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMTEwJTJGMTEwOSUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String engedu_kongju = "https://engedu.kongju.ac.kr/ZA0130/9840/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMTMwJTJGMTExNyUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String education_kongju = "https://education.kongju.ac.kr/ZA0330/9900/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMzMwJTJGMTE0MiUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String list_kongju = "https://lise.kongju.ac.kr/ZA0370/9958/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMzcwJTJGMTE0OSUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String historyedu_kongju = "https://historyedu.kongju.ac.kr/ZA9930/10997/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkE5OTMwJTJGMTE1NyUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String geoedu_kongju = "https://geoedu.kongju.ac.kr/ZA9910/10056/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkE5OTEwJTJGMTE2NSUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String hanmoon_kongju = "https://hanmoon.kongju.ac.kr/ZA0120/9816/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMTIwJTJGMTEzMyUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String ethics_kongju = "https://ethics.kongju.ac.kr/ZA0410/9857/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwNDEwJTJGMTEzNyUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String bie_kongju = "https://bie.kongju.ac.kr/ZA0360/9921/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMzYwJTJGMTE0NSUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String speud_kongju = "https://spedu.kongju.ac.kr/ZA0380/9994/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwMzgwJTJGMTE1NCUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String socialedu_kongju = "https://socialedu.kongju.ac.kr/ZA9950/10029/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkE5OTUwJTJGMTE2MiUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";
    String child_kongju = "https://child.kongju.ac.kr/ZA0400/10085/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGWkEwNDAwJTJGMTE3MSUyRmFydGNsTGlzdC5kbyUzRnBhZ2UlM0QxJTI2c3JjaENvbHVtbiUzRCUyNnNyY2hXcmQlM0QlMjZiYnNDbFNlcSUzRCUyNmJic09wZW5XcmRTZXElM0QlMjZyZ3NCZ25kZVN0ciUzRCUyNnJnc0VuZGRlU3RyJTNEJTI2aXNWaWV3TWluZSUzRGZhbHNlJTI2";

    // 인문사회과학대학


}

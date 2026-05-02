
/**
 * MultiplicationTable 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class GugudanTable
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private int gu;

    /**
     * MultiplicationTable 클래스의 객체 생성자
     */
    public GugudanTable(int gu)
    {
        // 인스턴스 변수 초기화
        this.gu=gu;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    int result=0;
    public void calculate()
    {
        // 여기에 코드를 작성하세요.
        for(int i=1;i<=9;i++){
            result=gu*i;
        }
    }
    
    public void print(){
        for(int i=1;i<=9;i++){
            System.out.println(gu+"x"+i+"="+result);
        }
    }
}
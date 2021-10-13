package racinggame.view;

public enum Script {
    inputCarName("경주할 자동차 이름을 입력하세요.(이름은 쉼포(,) 기준으로 구분)"),
    inputCount("시도할 회수는 몇회인가요?"),
    playResult("실행 결과");

    private final String ment;

    Script(String ment) {
        this.ment = ment;
    }

    public String getMent() {
        return ment;
    }
}

package store;

public class Counter {

    private InputView inputView;
    private OutputView outputView;

    private Counter(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public static Counter create(InputView inputView, OutputView outputView) {
        return new Counter(inputView, outputView);
    }


}

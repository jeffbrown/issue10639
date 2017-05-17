package demo

class DemoController {

    def index() {
        log.debug 'Logging from controller action'
        somePrivateMethod()
        render 'Success'
    }

    private void somePrivateMethod() {
        log.debug 'Logging from some private method'
    }
}

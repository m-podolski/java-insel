package c8.sealedClasses;

abstract sealed class Result permits Failure, Success {

  final Object body;

  public Result(Object body) {
    this.body = body;
  }
}

final class Success extends Result {

  Success(Object body) {
    super(body);
  }
}

final class Failure extends Result {

  final int errorCode;

  Failure(int errorCode, Object body) {
    super(body);
    this.errorCode = errorCode;
  }
}

class Baking {

  static Result cake() {
    return Math.random() > 0.5 ? new Success("Yummy")
      : new Failure(29, "Burned");
  }
}
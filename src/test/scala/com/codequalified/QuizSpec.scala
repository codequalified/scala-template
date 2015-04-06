package com.codequalified

import org.specs2.mutable._

class QuizSpec extends Specification{

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
  }

}

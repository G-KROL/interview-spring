package com.company.interview

import spock.lang.Specification

class InterviewApplicationSpec extends Specification {

    def "test test"() {
        when:
        def test = InterviewApplication.test()

        then:
        test.size() > 0
        test == "TEST"
    }
}

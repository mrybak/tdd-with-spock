package pl.mrybak.utils

class PositionalRepresentationTest extends spock.lang.Specification {
    PositionalRepresentation representation = new PositionalRepresentation(1000)


    def "should not accept negative radix"() {
        when:
            representation.getRepresentation(-2)

        then:
            thrown(IllegalArgumentException)

    }

    def "should not accept radix greater than 36"() {
        when:
        representation.getRepresentation(37)

        then:
        thrown(IllegalArgumentException)

    }
}
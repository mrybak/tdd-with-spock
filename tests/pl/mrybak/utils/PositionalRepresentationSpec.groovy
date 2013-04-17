package pl.mrybak.utils

class PositionalRepresentationTest extends spock.lang.Specification {
    def "should not accept negative radix"() {
        given:
            PositionalRepresentation representation = new PositionalRepresentation(1000)

        when:
            representation.getRepresentation(-2)

        then:
            thrown(IllegalArgumentException)

    }
}
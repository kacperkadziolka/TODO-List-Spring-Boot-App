package com.kkadziolka.TODOList.TODO;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class TODORepositoryTest {

    @Autowired
    private TODORepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void ItShouldBeFindByTitle() {

        // given
        String title = "Smieci";
        TODO testTODO = new TODO(title, "Wyrzucic smieci",
                LocalDate.of(2022, Month.JULY, 20));
        underTest.save(testTODO);

        // when
        TODO expected = underTest.findByTitle(title);

        // then
        assertThat(expected).isEqualTo(testTODO);
    }

    @Test
    void ItShouldNotBeFindByTitle() {

        // given
        String title = "Smieci";
        TODO testTODO = new TODO("!Smieci", "Wyrzucic smieci",
                LocalDate.of(2022, Month.JULY, 20));
        underTest.save(testTODO);

        // when
        TODO expected = underTest.findByTitle(title);

        // then
        assertThat(expected).isNotEqualTo(testTODO);
    }
}
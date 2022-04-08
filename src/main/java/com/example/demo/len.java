package com.example.demo;

import java.util.Date;
import java.util.Objects;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class len {

    public class Person {
        String name;
        double height;
        Home home = new Home();

        public Person(String sherlock, double v) {
            this.height = v;
            this.name = sherlock;
        }
    }

    public class Home {
        Address address = new Address();
        Date ownedSince;
    }

    public class Address {
        int number;
        String street;

        @Override
        public boolean equals(final Object other) {
            if (!(other instanceof Address)) return false;
            Address castOther = (Address) other;
            return Objects.equals(number, castOther.number);
        }
    }

    @Test
    public void test (){
        Person sherlock = new Person("Sherlock", 1.80);
        sherlock.home.ownedSince = new Date(123);
        sherlock.home.address.street = "Baker Street";
        sherlock.home.address.number = 221;

        Person sherlock2 = new Person("Sherlock", 1.80);
        sherlock2.home.ownedSince = new Date(123);
        sherlock2.home.address.street = "Baker Streete";
        sherlock2.home.address.number = 221;

// assertion succeeds as the data of both objects are the same.
        assertThat(sherlock).usingRecursiveComparison().ignoringAllOverriddenEquals()
            .isEqualTo(sherlock2);

// assertion fails as Person equals only compares references.
//        assertThat(sherlock).isEqualTo(sherlock2);
    }
}

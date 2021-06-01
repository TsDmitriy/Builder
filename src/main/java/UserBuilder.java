interface UserBuilder {
    UserBuilder setName(String name);
    UserBuilder setGender(Gender gender);
    UserBuilder setAge(int age);
    User build();
}

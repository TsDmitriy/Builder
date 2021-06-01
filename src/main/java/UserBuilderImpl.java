
public class UserBuilderImpl implements  UserBuilder {
    User user= new User();

    @Override
    public UserBuilder setName(String name) {
        user.name = name;
        return this;
    }

    @Override
    public UserBuilder setGender(Gender gender) {
        user.gender=gender;
        return this;
    }

    @Override
    public UserBuilder setAge(int age) {
        user.age = age;
        return this;
    }

    @Override
    public User build() {
        return user;
    }
}

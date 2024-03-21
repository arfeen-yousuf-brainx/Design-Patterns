package mypackage;
/**
 * Factory
 */
public class Factory {

}

interface PhoneCall {
    void makePhoneCall(String phoneNo);
}

class Nokia implements PhoneCall {

    @Override
    public void makePhoneCall(String phoneNo) {
        System.out.println("Making Nokia call to " + phoneNo);
    }

}

class Android implements PhoneCall {

    @Override
    public void makePhoneCall(String phoneNo) {
        System.out.println("Making Android call to " + phoneNo);
    }

}

abstract class PhoneUser {
    public void makePhoneCall(String phoneNo) {
        PhoneCall phone = getPhoneCall();
        phone.makePhoneCall(phoneNo);
    }

    abstract public PhoneCall getPhoneCall();
}

class PersonAbove70 extends PhoneUser {

    @Override
    public PhoneCall getPhoneCall() {
        return new Nokia();
    }

}

class Person extends PhoneUser {

    @Override
    public PhoneCall getPhoneCall() {
        return new Android();
    }

}
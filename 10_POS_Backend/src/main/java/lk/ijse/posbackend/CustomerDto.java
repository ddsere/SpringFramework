package lk.ijse.posbackend;

public class CustomerDto {
    private String cid;
    private String cname;
    private String caddress;

    public CustomerDto(String cid, String cname, String caddress) {
        this.cid = cid;
        this.cname = cname;
        this.caddress = caddress;
    }

    public CustomerDto() {}

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
}

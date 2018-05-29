package pl.parkin9.Hang_out_Man.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "*Pole obowiązkowe")
    private String username;

    @NotBlank(message = "*Pole obowiązkowe")
    private String password;

    private Integer winCount = 0;

    private Integer loseCount = 0;

/////////////////////////////////////////////////////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(Integer loseCount) {
        this.loseCount = loseCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                '}';
    }
}

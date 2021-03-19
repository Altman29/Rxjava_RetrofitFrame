package retrofit.Utils;

import java.util.List;

/**
 * Created by Clark Chen. on 3/19/21.
 * e-mail:altman29@foxmail.com
 * Desc:
 */
public class BaseResponseList<T> {
    private int res_code;
    private String err_msg;
    private List<T> demos;
    public int getRes_code() {
        return res_code;
    }
    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }
    public String getErr_msg() {
        return err_msg;
    }
    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
    public List<T> getDemos() {
        return demos;
    }
    public void setDemo(List<T> demos) {
        this.demos = demos;
    }
}
package retrofit.Utils;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 数据返回统一处理  参考https://www.jianshu.com/p/ff619fea7e22
 *
 * @param <T>
 */
public abstract class BaseObserverList<T> implements Observer<BaseResponseList<T>> {
    private static final String TAG = "BaseObserverList";

    @Override
    public void onNext(BaseResponseList<T> response) {
        //在这边对 基础数据 进行统一处理  举个例子：
        if (response.getRes_code() == 200) {
            onSuccess(response.getDemos());
        } else {
            onFailure(null, response.getErr_msg() + " | code: " + response.getRes_code());
        }
    }

    @Override
    public void onError(Throwable e) {//服务器错误信息处理
        onFailure(e, RxExceptionUtil.exceptionHandler(e));
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onSubscribe(Disposable d) {
    }

    public abstract void onSuccess(List<T> result);

    public abstract void onFailure(Throwable e, String errorMsg);

}

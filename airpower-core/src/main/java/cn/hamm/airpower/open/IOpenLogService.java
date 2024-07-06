package cn.hamm.airpower.open;

/**
 * <h1>开放应用请求日志接口</h1>
 *
 * @author Hamm.cn
 * @apiNote 请确保你的应用请求日志 <code>Service</code> 实现了此接口，否则将无法记录请求日志
 */
public interface IOpenLogService {
    /**
     * <h2>添加一个请求日志</h2>
     *
     * @param openApp     开放应用
     * @param url         请求地址
     * @param requestBody 请求体
     * @return 请求日志ID
     */
    Long addRequest(IOpenApp openApp, String url, String requestBody);

    /**
     * <h2>更新请求日志</h2>
     *
     * @param openLogId    请求日志 <code>ID</code>
     * @param responseBody 响应体
     */
    void updateResponse(Long openLogId, String responseBody);
}

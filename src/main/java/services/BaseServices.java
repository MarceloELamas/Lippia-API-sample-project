package services;

import com.crowdar.api.rest.MethodsService;

public class BaseServices extends MethodsService {
    public static ThreadLocal<String> API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACEID = new ThreadLocal<>();

    public static ThreadLocal<String> ID = new ThreadLocal<>();
}

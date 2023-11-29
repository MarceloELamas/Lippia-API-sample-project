package services;

import com.crowdar.api.rest.MethodsService;

public class BaseServices extends MethodsService {
    public static ThreadLocal<String> API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<>();

    public static ThreadLocal<String> ID = new ThreadLocal<>();

    public static ThreadLocal<String> DESCRIPTION = new ThreadLocal<>();

    public static ThreadLocal<String> END = new ThreadLocal<>();

    public static ThreadLocal<String> START = new ThreadLocal<>();

    public static ThreadLocal<String> PROYECT_ID = new ThreadLocal<>();
}

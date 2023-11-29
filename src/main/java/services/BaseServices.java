package services;

import com.crowdar.api.rest.MethodsService;

public class BaseServices extends MethodsService {
    public static ThreadLocal<String> API_KEY = new ThreadLocal<>();
}

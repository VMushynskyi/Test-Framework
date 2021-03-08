package framework.api.constants;

import lombok.Getter;

@Getter
public enum MethodsUrl {
    POSTS("posts/"),
    TITLE_QUERY("?title=");

    private final String queryParameter;

    MethodsUrl(String queryParameter) {
        this.queryParameter = queryParameter;
    }
}

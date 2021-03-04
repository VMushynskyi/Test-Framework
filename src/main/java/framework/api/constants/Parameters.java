package framework.api.constants;

import lombok.Getter;

@Getter
public enum Parameters {
    POSTS("posts/"),
    TITLE_QUERY("?title=");

    private final String queryParameter;

    Parameters(String queryParameter) {
        this.queryParameter = queryParameter;
    }
}

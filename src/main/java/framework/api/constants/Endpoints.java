package framework.api.constants;

import lombok.Getter;

@Getter
public enum Endpoints {
    POSTS("/posts/"),
    TITLE_QUERY("?title=");

    private final String parameter;

    Endpoints(String parameter) {
        this.parameter = parameter;
    }
}

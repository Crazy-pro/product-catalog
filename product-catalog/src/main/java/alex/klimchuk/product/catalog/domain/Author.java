package alex.klimchuk.product.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private String image;
}

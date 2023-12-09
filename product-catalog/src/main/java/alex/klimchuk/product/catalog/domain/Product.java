package alex.klimchuk.product.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> productCategories = new ArrayList<>();
    private String imageUrl;
}

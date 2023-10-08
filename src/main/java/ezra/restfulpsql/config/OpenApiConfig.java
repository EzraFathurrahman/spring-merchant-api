package ezra.restfulpsql.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(title="Merchant Store API",
        version = "1.0.0",
        description = "This is API documentation for Merchant and Store API",
        termsOfService = "Ezrafathur",
        contact = @Contact(
                name="M Ezra F",
                email="ezrafathurrahman@gmail.com"
        ),
license= @License(name="My License", url="ezracode")
        )
)
public class OpenApiConfig {
}

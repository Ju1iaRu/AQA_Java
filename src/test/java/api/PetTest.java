package api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.List;
import static io.restassured.RestAssured.given;


public class PetTest {

    private final static String URL = "https://petstore.swagger.io/";

    @Test
    public void checkNameTagPetTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<PetTagsData> petTags = given()
                .when()
                .get("v2/pet/9")
                .then().log().all()
                .extract().body().jsonPath().getList("tags", PetTagsData.class);
        petTags.forEach(x -> Assert.assertTrue(x.getName().contains("string")));
    }


    @Test
    public void checkStatusPetTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        PetData petStatus = given()
                .when()
                .get("v2/pet/9")
                .then().log().all()
                .extract().body().jsonPath().getObject(".", PetData.class);
        Assertions.assertEquals("sold", petStatus.getStatus());
        System.out.println(petStatus.getStatus());
    }


    @Test
    public void checkFindByStatusTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<PetData> soldPets = given()
                .when()
                .get("v2/pet/findByStatus?status=sold")
                .then().log().all()
                .extract().body().jsonPath().getList(".", PetData.class);
        Assertions.assertTrue(soldPets.size() > 0);
        Assertions.assertEquals("sold", soldPets.get(0).getStatus());
        System.out.println(soldPets.get(0).getStatus());
    }
}





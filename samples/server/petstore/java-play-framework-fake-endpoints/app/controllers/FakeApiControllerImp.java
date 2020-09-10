package controllers;

import java.math.BigDecimal;
import apimodels.Client;
import apimodels.FileSchemaTestClass;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import apimodels.OuterComposite;
import apimodels.User;
import apimodels.XmlItem;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
public class FakeApiControllerImp implements FakeApiControllerImpInterface {
    @Override
    public void createXmlItem(Request request, XmlItem xmlItem) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Boolean fakeOuterBooleanSerialize(Request request, Boolean body) throws Exception {
        //Do your magic!!!
        return new Boolean(true);
    }

    @Override
    public OuterComposite fakeOuterCompositeSerialize(Request request, OuterComposite body) throws Exception {
        //Do your magic!!!
        return new OuterComposite();
    }

    @Override
    public BigDecimal fakeOuterNumberSerialize(Request request, BigDecimal body) throws Exception {
        //Do your magic!!!
        return new BigDecimal(1.0);
    }

    @Override
    public String fakeOuterStringSerialize(Request request, String body) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void testBodyWithFileSchema(Request request, FileSchemaTestClass body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testBodyWithQueryParams(Request request, @NotNull String query, User body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Client testClientModel(Request request, Client body) throws Exception {
        //Do your magic!!!
        return new Client();
    }

    @Override
    public void testEndpointParameters(Request request, BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, Http.MultipartFormData.FilePart binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testEnumParameters(Request request, List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testGroupParameters(Request request, @NotNull Integer requiredStringGroup, Boolean requiredBooleanGroup, @NotNull Long requiredInt64Group, Integer stringGroup, Boolean booleanGroup, Long int64Group) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testInlineAdditionalProperties(Request request, Map<String, String> param) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testJsonFormData(Request request, String param, String param2) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void testQueryParameterCollectionFormat(Request request, @NotNull List<String> pipe, @NotNull List<String> ioutil, @NotNull List<String> http, @NotNull List<String> url, @NotNull List<String> context) throws Exception {
        //Do your magic!!!
    }

}

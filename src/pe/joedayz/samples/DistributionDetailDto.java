package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.List;


public class DistributionDetailDto {

    private int row;
    private String containerCode;
    private String purchaseOrderCode;
    private String sku;
    private Integer quantityInformed;
    public List<String> errorList = new ArrayList<>();


    public boolean isNull() {
        return this.containerCode == null && this.purchaseOrderCode == null && sku == null && quantityInformed == null;

    }


    public void validate() {

        if (!isValid(containerCode)) {
            errorList.add("CommonMessage.CONTAINER_NOT_VALID");
        }
        if (!isValid(purchaseOrderCode)) {
            errorList.add("PurchaseOrderMessage.PURCHASE_ORDER_NOT_VALID");
        }

        if (!isValid(sku)) {
            errorList.add("PurchaseOrderMessage.SKU_NOT_VALID");
        }

        if (!isNotNullAndPositive(quantityInformed)) {
            errorList.add("CommonMessage.QUANTITY_NOT_VALID");
        }
    }


    public boolean isValid() {
        if (errorList.size() == 0) {
            return true;
        }
        return false;
    }

    private boolean isValid(String value) {
        return value != null && !value.isEmpty();
    }

    private boolean isNotNullAndPositive(Integer value) {
        return value != null && value > 0;
    }

}

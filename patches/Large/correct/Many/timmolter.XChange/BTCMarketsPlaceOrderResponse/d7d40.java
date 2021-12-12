diff --git a/xchange-btcmarkets/src/main/java/org/knowm/xchange/btcmarkets/dto/trade/BTCMarketsPlaceOrderResponse.java b/xchange-btcmarkets/src/main/java/org/knowm/xchange/btcmarkets/dto/trade/BTCMarketsPlaceOrderResponse.java
index 6abffd5..407136c 100644
--- a/xchange-btcmarkets/src/main/java/org/knowm/xchange/btcmarkets/dto/trade/BTCMarketsPlaceOrderResponse.java
+++ b/xchange-btcmarkets/src/main/java/org/knowm/xchange/btcmarkets/dto/trade/BTCMarketsPlaceOrderResponse.java
@@ -6,20 +6,20 @@
 public class BTCMarketsPlaceOrderResponse extends BTCMarketsBaseResponse {
 
   private final String clientRequestId;
-  private final Integer id;
+  private final Long id;
 
   public BTCMarketsPlaceOrderResponse(
       @JsonProperty("success") Boolean success,
       @JsonProperty("errorMessage") String errorMessage,
       @JsonProperty("errorCode") Integer errorCode,
       @JsonProperty("clientRequestId") String clientRequestId,
-      @JsonProperty("id") Integer id) {
+      @JsonProperty("id") Long id) {
     super(success, errorMessage, errorCode);
     this.clientRequestId = clientRequestId;
     this.id = id;
   }
 
-  public Integer getId() {
+  public Long getId() {
     return id;
   }
 

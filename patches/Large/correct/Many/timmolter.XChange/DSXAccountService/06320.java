diff --git a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXAccountService.java b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXAccountService.java
index 5cfc393..19e9d66 100644
--- a/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXAccountService.java
+++ b/xchange-dsx/src/main/java/org/knowm/xchange/dsx/service/DSXAccountService.java
@@ -107,7 +107,7 @@
 
     List<FundingRecord> result = new ArrayList<>();
     for (Map.Entry<Long, DSXTransHistoryResult> t : getDSXTransHistory(count, fromId, toId, null, since, end, type, status, currency).entrySet()) {
-        result.add(new FundingRecord(t.getValue().getAddress(), new Date(t.getValue().getTimestamp()), Currency.getInstance(t.getValue().getCurrency()),
+        result.add(new FundingRecord(t.getValue().getAddress(), new Date(t.getValue().getTimestamp() * 1000), Currency.getInstance(t.getValue().getCurrency()),
             t.getValue().getAmount(), Long.toString(t.getValue().getId()), null, convert(t.getValue().getType()), convert(t.getValue().getStatus()), null,
             t.getValue().getCommission(), null));
     }
@@ -131,7 +131,7 @@
 
   private FundingRecord.Type convert(DSXTransHistoryResult.Type type) {
       switch (type) {
-        case Deposit: return FundingRecord.Type.DEPOSIT;
+        case Incoming: return FundingRecord.Type.DEPOSIT;
         case Withdraw: return FundingRecord.Type.WITHDRAWAL;
       default:
         throw new RuntimeException("Unknown DSX transaction type: " + type);

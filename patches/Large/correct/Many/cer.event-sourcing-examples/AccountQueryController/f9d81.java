diff --git a/java-spring/accounts-query-side-web/src/main/java/net/chrisrichardson/eventstore/javaexamples/banking/web/queryside/accounts/AccountQueryController.java b/java-spring/accounts-query-side-web/src/main/java/net/chrisrichardson/eventstore/javaexamples/banking/web/queryside/accounts/AccountQueryController.java
index 455ddf1..fd31810 100644
--- a/java-spring/accounts-query-side-web/src/main/java/net/chrisrichardson/eventstore/javaexamples/banking/web/queryside/accounts/AccountQueryController.java
+++ b/java-spring/accounts-query-side-web/src/main/java/net/chrisrichardson/eventstore/javaexamples/banking/web/queryside/accounts/AccountQueryController.java
@@ -52,7 +52,7 @@
   public ResponseEntity<AccountHistoryResponse> getTransactionsHistory(@PathVariable String accountId) {
     AccountInfo accountInfo = accountInfoQueryService.findByAccountId(accountId);
     List<AccountHistoryEntry> historyEntries = new ArrayList<>();
-    historyEntries.add(new AccountOpenInfo(accountInfo.getDate(), AccountHistoryEntry.EntryType.account, accountInfo.getChanges().get(0).getAmount()));
+    historyEntries.add(new AccountOpenInfo(accountInfo.getCreationDate(), AccountHistoryEntry.EntryType.account, accountInfo.getChanges().get(0).getAmount()));
     accountInfo.getTransactions().forEach(historyEntries::add);
 
     return ResponseEntity.ok().body(new AccountHistoryResponse(historyEntries));

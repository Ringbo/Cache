diff --git a/wallet/src/de/schildbach/wallet/ui/SendCoinsQrActivity.java b/wallet/src/de/schildbach/wallet/ui/SendCoinsQrActivity.java
index b495cdd..a397a00 100644
--- a/wallet/src/de/schildbach/wallet/ui/SendCoinsQrActivity.java
+++ b/wallet/src/de/schildbach/wallet/ui/SendCoinsQrActivity.java
@@ -34,7 +34,7 @@
 /**
  * @author Andreas Schildbach
  */
-public final class SendCoinsQrActivity extends AbstractWalletActivity
+public final class SendCoinsQrActivity extends Activity
 {
 	private static final int REQUEST_CODE_SCAN = 0;
 
@@ -66,7 +66,7 @@
 				@Override
 				protected void handleDirectTransaction(final Transaction transaction) throws VerificationException
 				{
-					final WalletApplication application = getWalletApplication();
+					final WalletApplication application = (WalletApplication) getApplication();
 					application.processDirectTransaction(transaction);
 
 					SendCoinsQrActivity.this.finish();

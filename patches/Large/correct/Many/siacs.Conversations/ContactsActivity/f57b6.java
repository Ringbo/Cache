diff --git a/src/eu/siacs/conversations/ui/ContactsActivity.java b/src/eu/siacs/conversations/ui/ContactsActivity.java
index 2e9e55f..835e0a6 100644
--- a/src/eu/siacs/conversations/ui/ContactsActivity.java
+++ b/src/eu/siacs/conversations/ui/ContactsActivity.java
@@ -381,8 +381,7 @@
 				contactJid.setText(contact.getJid());
 				ImageView imageView = (ImageView) view
 						.findViewById(R.id.contact_photo);
-				imageView.setImageBitmap(UIHelper.getContactPicture(contact,
-						null, 90, this.getContext()));
+				imageView.setImageBitmap(UIHelper.getContactPicture(contact, 90, this.getContext()));
 				return view;
 			}
 		};

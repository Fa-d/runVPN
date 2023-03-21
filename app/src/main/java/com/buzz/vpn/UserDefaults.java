package com.buzz.vpn;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.google.gson.Gson;

import java.util.List;


public class UserDefaults {

    private SharedPreferences _prefs;
    private Editor _editor;
    private String managementDetailUrl = "";
    private String server = "";
    private String forgotUrl = "";
    private String storeUser = "";
    private String storePass = "";
    private String payPalClientID = "";
    private String userName = "";
    private String password = "";
    private String udid = "";
    private long freeMin = 0;
    private String anyConnectServer = "";
    private String openvpnServer = "";
    private String remainingDays = "";
    private String configURL_v3 = "";
    private String signUpURL = "";
    private String paymentURL = "";
    private String deviceInfoURL = "";
    private String serverList = "";
    private String inAppPackagesList = "";
    private String amazonPackagesList = "";
    private String inAppHuaweiPackages = "";
    private String cardPaymentsList = "";
    private String premiumFeaturesList = "";
    private String feature_img_offer = "";
    private String feature_url_offer = "";
    private String userType = "2";
    private String showBannerToResellerUser = "1";
    private String userStatus = "";
    private String skuIDs = "";
    private int selectedServerPosition = 0;
    private int listSortingType = 1;
    private boolean enableSignUpInUAE = false;
    private boolean showWallet = false;
    private boolean shouldshowPurchaseAlert = false;
    private boolean showApiBannerAd = false;
    private boolean showDynamicMenu = false;
    private boolean newSignUp = false;
    private boolean isUsingNewListUI = false;
    private String nextAdTime = "";
    private String pricing = "";
    private String pricingOnline = "";
    private boolean tos = false;
    private long nextRefreshTime = 0;
    private long nextPushUpdateTime = 0;
    private boolean PurchasePending = false;
    private boolean freeMinPending = false;
    private long remainingFreeMin = 0;
    private boolean offer_valid_for_all = false;
    private String offer_URL = "";
    private String about_url = "";
    private String serverSyncUrl = "";
    private String freeMinUrl = "";
    private boolean showWhatsapp = true;
    private boolean showbuynow = true;
    private boolean notificationEnabled = true;
    private String wpnumber = "";
    private String freeMinAmount = "5";
    private String exchange_text = "";
    private long version_code = 0;
    private boolean force_update = false;
    private String transaction_id = "";
    private String transactionType = "";
    private String price = "";
    private String usernameForPurchase = "";
    private String push_url = "";
    private String pushToken = "";
    private String contactEmail = "";
    private int selectedPurchase = -1;
    private boolean shouldAutoLogout = false;
    private boolean isLoggedIn = false;
    private boolean isLotteryEnabled = true;
    private boolean showBannerToReseller = true;
    private boolean payPalEnabled = true;
    private boolean inAppPurchaseEnabled = true;
    private boolean freeMinEnabled = true;
    private String sni = "m.facebook.com";
    private String startDate = "";
    private String encServer = "ZUEfekJEQ0JQ";
    private int selectedServerID = 0;
    private int selectedGroupPosition = 0;
    private int selectedChildPosition = 0;
    private String selectedServerNote = "";
    private String networkImageLink = "";
    private int localPort = 0;
    private String blockPackage = "";
    private String amazon_receipt = "";
    private String google_purchase_token = "";
    private int noticeType = 0;
    private String noticeStatus = "";
    private String notice = "";
    private String lockServerIds = "";
    private String validity = "";
    private String expiredAt = "";
    private String streamingTitle = "";
    private String streamingLink = "";
    private boolean showRatingPopUp = false;
    private boolean scheduleRating = true;

    // referral
    private boolean allow_referrence_feature = true;
    private String referral_code = "";
    private String used_referral_code = "";
    private float mature_balance = 0;
    private float available_balance = 0;
    private boolean pending_withdraw_request = false;
    private float minimum_withdrawal_amount = 5;

    private String referRefreshURL = "";
    private String referStatementURL = "";
    private String referSubmitURL = "";
    private String referWithdrawURL = "";
    private String refer_bonus = "";

    private String swiftCode = "";
    private String bankAddress = "";
    private String accountNumber = "";
    private String accountName = "";
    private String bankName = "";
    private String payPalEmail = "";
    private String bkashNumber = "";
    private String bkashType = "bKash";
    private int paymentMode = 1;
    private String contactNumber = " ~~ ";
    private String contactAddress = "";
    private String contactCountry = "";
    private String contactName = "";
    private String refersms = "";
    private String bannerData = "";
    private String dynamicMenuData = "";
    private String premium_features_list = "";
    private String sessionByte = "";
    private String wgConfigUrl = "";


    public String getSwiftCode() {
        if (this._prefs == null) {
            return "";
        }

        this.swiftCode = this._prefs.getString("swiftCode", swiftCode);
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("swiftCode", swiftCode);

    }

    public String getBankAddress() {
        if (this._prefs == null) {
            return "";
        }

        this.bankAddress = this._prefs.getString("bankAddress", bankAddress);
        return this.bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("bankAddress", bankAddress);
    }

    public String getAccountNumber() {
        if (this._prefs == null) {
            return "";
        }

        this.accountNumber = this._prefs.getString("accountNumber", accountNumber);
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("accountNumber", accountNumber);
    }

    public String getAccountName() {
        if (this._prefs == null) {
            return "";
        }

        this.accountName = this._prefs.getString("accountName", accountName);
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("accountName", accountName);
    }


    public String getBankName() {
        if (this._prefs == null) {
            return "";
        }

        this.bankName = this._prefs.getString("bankName", bankName);
        return this.bankName;
    }

    public void setBankName(String bankName) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("bankName", bankName);
    }

    public String getPayPalEmail() {
        if (this._prefs == null) {
            return "";
        }

        this.payPalEmail = this._prefs.getString("payPalEmail", payPalEmail);
        return this.payPalEmail;
    }

    public void setPayPalEmail(String payPalEmail) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("payPalEmail", payPalEmail);
    }

    public String getBkashNumber() {
        if (this._prefs == null) {
            return "";
        }

        this.bkashNumber = this._prefs.getString("bkashNumber", bkashNumber);
        return this.bkashNumber;
    }

    public void setBkashNumber(String bkashNumber) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("bkashNumber", bkashNumber);
    }

    public String getBkashType() {
        if (this._prefs == null) {
            return "";
        }

        this.bkashType = this._prefs.getString("bkashType", bkashType);
        return this.bkashType;
    }

    public void setBkashType(String bkashType) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("bkashType", bkashType);
    }

    public int getPaymentMode() {
        if (this._prefs == null) {
            return 0;
        }

        this.paymentMode = this._prefs.getInt("paymentMode", paymentMode);
        return this.paymentMode;
    }

    public void setPaymentMode(int paymentMode) {
        if (this._editor == null) {
            return;
        }
        this._editor.putInt("paymentMode", paymentMode);
    }

    public String getContactNumber() {
        if (this._prefs == null) {
            return " ~~ ";
        }

        this.contactNumber = this._prefs.getString("contactNumber", contactNumber);
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("contactNumber", contactNumber);
    }

    public String getContactAddress() {
        if (this._prefs == null) {
            return "";
        }

        this.contactAddress = this._prefs.getString("contactAddress", contactAddress);
        return this.contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("contactAddress", contactAddress);
    }

    public String getContactName() {
        if (this._prefs == null) {
            return "";
        }

        this.contactName = this._prefs.getString("contactName", contactName);
        return this.contactName;
    }

    public void setContactName(String contactName) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("contactName", contactName);
    }


    public String getContactCountry() {
        if (this._prefs == null) {
            return "";
        }

        this.contactCountry = this._prefs.getString("contactCountry", contactCountry);
        return this.contactCountry;
    }

    public void setContactCountry(String contactCountry) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("contactCountry", contactCountry);
    }


    public String getReferRefreshURL() {
        if (this._prefs == null) {
            return "";
        }

        this.referRefreshURL = this._prefs.getString("referRefreshURL", referRefreshURL);
        return this.referRefreshURL;
    }

    public void setReferRefreshURL(String referRefreshURL) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("referRefreshURL", referRefreshURL);

    }

    public String getReferStatementURL() {
        if (this._prefs == null) {
            return "";
        }

        this.referStatementURL = this._prefs.getString("referStatementURL", referStatementURL);
        return this.referStatementURL;
    }


    public String getNoticeStatus() {
        if (this._prefs == null) {
            return "";
        }

        this.noticeStatus = this._prefs.getString("noticeStatus", noticeStatus);
        return this.noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("noticeStatus", noticeStatus);
    }

    public int getNoticeType() {
        if (this._prefs == null) {
            return 0;
        }

        this.noticeType = this._prefs.getInt("noticeType", noticeType);
        return this.noticeType;
    }

    public void setNoticeType(int noticeType) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("noticeType", noticeType);
    }

    public String getNotice() {
        if (this._prefs == null) {
            return "";
        }

        this.notice = this._prefs.getString("notice", notice);
        return this.notice;
    }

    public void setNotice(String notice) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("notice", notice);
    }

    public String getLockServerIds() {
        if (this._prefs == null) {
            return "";
        }

        this.lockServerIds = this._prefs.getString("lockServerIds", lockServerIds);
        return this.lockServerIds;
    }

    public void setLockServerIds(String lockServerIds) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("lockServerIds", lockServerIds);
    }


    public void setNotificationEnabled(boolean notificationEnabled) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("notificationEnabled", notificationEnabled);
    }

    public boolean isNotificationEnabled() {
        if (this._prefs == null) {
            return false;
        }

        this.notificationEnabled = this._prefs.getBoolean("notificationEnabled", this.notificationEnabled);
        return this.notificationEnabled;
    }

    public int getLocalPort() {
        if (this._prefs == null) {
            return 0;
        }

        this.localPort = this._prefs.getInt("localPort", localPort);
        return this.localPort;
    }

    public void setLocalPort(int localPort) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("localPort", localPort);
    }


    public void setInAppPurchaseEnabled(boolean inAppPurchaseEnabled) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("inAppPurchaseEnabled", inAppPurchaseEnabled);
    }

    public boolean isInAppPurchaseEnabled() {

        if (this._prefs == null) {
            return false;
        }

        this.inAppPurchaseEnabled = this._prefs.getBoolean("inAppPurchaseEnabled", inAppPurchaseEnabled);
        return this.inAppPurchaseEnabled;
    }

    public void setPayPalEnabled(boolean payPalEnabled) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("payPalEnabled", payPalEnabled);
    }

    public boolean isPayPalEnabled() {
        if (this._prefs == null) {
            return false;
        }

        this.payPalEnabled = this._prefs.getBoolean("payPalEnabled", payPalEnabled);
        return this.payPalEnabled;
    }

    public void setShowRatingPopUp(boolean showRatingPopUp) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("showRatingPopUp", showRatingPopUp);
    }

    public boolean isShowRatingPopUp() {
        if (this._prefs == null) {
            return false;
        }

        this.showRatingPopUp = this._prefs.getBoolean("showRatingPopUp", showRatingPopUp);
        return this.showRatingPopUp;
    }

    public void setScheduleRating(boolean scheduleRating) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("scheduleRating", scheduleRating);
    }

    public boolean isScheduleRating() {
        if (this._prefs == null) {
            return false;
        }

        this.scheduleRating = this._prefs.getBoolean("scheduleRating", scheduleRating);
        return this.scheduleRating;
    }

    // referrral

    public void setAllowReferrenceFeature(boolean allow_referrence_feature) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("allow_referrence_feature", allow_referrence_feature);
    }

    public boolean isAllowReferrenceFeature() {
        if (this._prefs == null) {
            return false;
        }

        this.allow_referrence_feature = this._prefs.getBoolean("allow_referrence_feature", allow_referrence_feature);
        return this.allow_referrence_feature;
    }

    public void setPendingWithdrawRequest(boolean pending_withdraw_request) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("pending_withdraw_request", pending_withdraw_request);
    }

    public boolean isPendingWithdrawRequest() {
        if (this._prefs == null) {
            return false;
        }

        this.pending_withdraw_request = this._prefs.getBoolean("pending_withdraw_request", pending_withdraw_request);
        return this.pending_withdraw_request;
    }

    public String getReferralCode() {
        if (this._prefs == null) {
            return "";
        }

        this.referral_code = this._prefs.getString("referral_code", referral_code);
        return this.referral_code;
    }

    public void setReferralCode(String referral_code) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("referral_code", referral_code);
    }

    public String getUsedReferralCode() {
        if (this._prefs == null) {
            return "";
        }

        this.used_referral_code = this._prefs.getString("used_referral_code", used_referral_code);
        return this.used_referral_code;
    }

    public void setUsedReferralCode(String used_referral_code) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("used_referral_code", used_referral_code);
    }

    public float getMatureBalance() {
        if (this._prefs == null) {
            return 0;
        }

        this.mature_balance = this._prefs.getFloat("mature_balance", mature_balance);
        return this.mature_balance;
    }

    public void setMatureBalance(float mature_balance) {
        if (this._editor == null) {
            return;
        }

        this._editor.putFloat("mature_balance", mature_balance);
    }


    public float getAvailableBalance() {
        if (this._prefs == null) {
            return 0;
        }

        this.available_balance = this._prefs.getFloat("available_balance", available_balance);
        return this.available_balance;
    }

    public void setAvailableBalance(float available_balance) {
        if (this._editor == null) {
            return;
        }

        this._editor.putFloat("available_balance", available_balance);
    }

    public float getMinimumWithdrawalAmount() {
        if (this._prefs == null) {
            return 0;
        }

        this.minimum_withdrawal_amount = this._prefs.getFloat("minimum_withdrawal_amount", minimum_withdrawal_amount);
        return this.minimum_withdrawal_amount;
    }

    public void setMinimumWithdrawalAmount(float minimum_withdrawal_amount) {
        if (this._editor == null) {
            return;
        }

        this._editor.putFloat("minimum_withdrawal_amount", minimum_withdrawal_amount);
    }


    public void setFreeMinEnabled(boolean freeMinEnabled) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("freeMinEnabled", freeMinEnabled);
    }

    public boolean isFreeMinEnabled() {

        if (this._prefs == null) {
            return false;
        }

        this.freeMinEnabled = this._prefs.getBoolean("freeMinEnabled", freeMinEnabled);
        return this.freeMinEnabled;
    }


    public void setshowBannerToReseller(boolean showBannerToReseller) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("showBannerToReseller", showBannerToReseller);
    }

    public boolean isBannerToReseller() {

        if (this._prefs == null) {
            return false;
        }

        this.showBannerToReseller = this._prefs.getBoolean("showBannerToReseller", showBannerToReseller);
        return this.showBannerToReseller;
    }

    public String getNetworkImageLink() {
        if (this._prefs == null) {
            return "";
        }

        this.networkImageLink = this._prefs.getString("networkImageLink", networkImageLink);
        return this.networkImageLink;
    }

    public void setNetworkImageLink(String networkImageLink) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("networkImageLink", networkImageLink);
    }

    public int getSelectedServerID() {
        if (this._prefs == null) {
            return 0;
        }

        this.selectedServerID = this._prefs.getInt("selectedServerID", selectedServerID);
        return this.selectedServerID;
    }

    public void setSelectedServerID(int selectedServerID) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("selectedServerID", selectedServerID);
    }

    public int getSelectedGroupPosition() {
        if (this._prefs == null) {
            return 0;
        }

        this.selectedGroupPosition = this._prefs.getInt("selectedGroupPosition", selectedGroupPosition);
        return this.selectedGroupPosition;
    }

    public void setSelectedGroupPosition(int selectedGroupPosition) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("selectedGroupPosition", selectedGroupPosition);
    }


    public int getSelectedChildPosition() {
        if (this._prefs == null) {
            return 0;
        }

        this.selectedChildPosition = this._prefs.getInt("selectedChildPosition", selectedChildPosition);
        return this.selectedChildPosition;
    }

    public void setSelectedChildPosition(int selectedChildPosition) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("selectedChildPosition", selectedChildPosition);
    }


    public String getSelectedServerNote() {
        if (this._prefs == null) {
            return "";
        }

        this.selectedServerNote = this._prefs.getString("selectedServerNote", selectedServerNote);
        return this.selectedServerNote;
    }

    public void setSelectedServerNote(String selectedServerNote) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("selectedServerNote", selectedServerNote);

    }

    public void setForceUpdate(boolean force_update) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("force_update", force_update);
    }

    public boolean isForceUpdate() {

        if (this._prefs == null) {
            return false;
        }

        this.force_update = this._prefs.getBoolean("force_update", force_update);
        return this.force_update;
    }

    public long getVersionCode() {
        if (this._prefs == null) {
            return 0;
        }

        this.version_code = this._prefs.getLong("version_code", version_code);
        return this.version_code;
    }

    public void setVersionCode(long version_code) {
        if (this._editor == null) {
            return;
        }

        this._editor.putLong("version_code", version_code);
    }


    public void setShouldAutoLogout(boolean shouldAutoLogout) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("shouldAutoLogout", shouldAutoLogout);
    }

    public boolean shouldAutoLogout() {

        if (this._prefs == null) {
            return false;
        }

        this.shouldAutoLogout = this._prefs.getBoolean("shouldAutoLogout", false);
        return this.shouldAutoLogout;
    }

    public long getFreeMin() {
        if (this._prefs == null) {
            return 0;
        }

        this.freeMin = this._prefs.getLong("freeMin", freeMin);
        return this.freeMin;
    }

    public void setFreeMin(long freeMin) {
        if (this._editor == null) {
            return;
        }

        this._editor.putLong("freeMin", freeMin);
    }

    public int getSelectedPurchase() {
        if (this._prefs == null) {
            return -1;
        }

        this.selectedPurchase = this._prefs.getInt("selectedPurchase", selectedPurchase);
        return this.selectedPurchase;
    }

    public void setSelectedPurchase(int selectedPurchase) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("selectedPurchase", selectedPurchase);
    }

    public void setShowbuynow(boolean showbuynow) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("showbuynow", showbuynow);
    }

    public boolean isShowbuynow() {
        if (this._prefs == null) {
            return false;
        }

        this.showbuynow = this._prefs.getBoolean("showbuynow", true);
        return this.showbuynow;
    }

    public void setAbout_url(String about_url) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("about_url", about_url);
    }

    public String getAbout_url() {
        if (this._prefs == null) {
            return "";
        }
        this.about_url = this._prefs.getString("about_url", about_url);
        return this.about_url;
    }

    public void setPushToken(String pushToken) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("pushToken", pushToken);
    }

    public String getPushToken() {
        if (this._prefs == null) {
            return "";
        }
        this.pushToken = this._prefs.getString("pushToken", pushToken);
        return this.pushToken;
    }

    public void setContactEmail(String contactEmail) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("contactEmail", contactEmail);
    }

    public String getContactEmail() {
        if (this._prefs == null) {
            return "";
        }
        this.contactEmail = this._prefs.getString("contactEmail", contactEmail);
        return this.contactEmail;
    }

    public void setPush_url(String push_url) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("push_url", push_url);
    }

    public String getPush_url() {
        if (this._prefs == null) {
            return "";
        }
        this.push_url = this._prefs.getString("push_url", push_url);
        return this.push_url;
    }

    public void setShowWhatsapp(boolean showWhatsapp) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("showWhatsapp", showWhatsapp);
    }

    public boolean isShowWhatsapp() {
        if (this._prefs == null) {
            return false;
        }

        this.showWhatsapp = this._prefs.getBoolean("showWhatsapp", true);
        return this.showWhatsapp;
    }

    public String getWpnumber() {
        if (this._prefs == null) {
            return "";
        }
        this.wpnumber = this._prefs.getString("wpnumber", wpnumber);
        return this.wpnumber;
    }

    public void setWpnumber(String wpnumber) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("wpnumber", wpnumber);
    }

    public String getFreeMinAmount() {
        if (this._prefs == null) {
            return "";
        }
        this.freeMinAmount = this._prefs.getString("freeMinAmount", freeMinAmount);
        return this.freeMinAmount;
    }

    public void setFreeMinAmount(String freeMinAmount) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("freeMinAmount", freeMinAmount);
    }

    public String getExchangeText() {
        if (this._prefs == null) {
            return "";
        }
        this.exchange_text = this._prefs.getString("exchange_text", exchange_text);
        return this.exchange_text;
    }

    public void setExchangeText(String exchange_text) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("exchange_text", exchange_text);
    }

    public void setOffer_valid_for_all(boolean offer_valid_for_all) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("offer_valid_for_all", offer_valid_for_all);
    }

    public boolean isOffer_valid_for_all() {
        if (this._prefs == null) {
            return false;
        }

        this.offer_valid_for_all = this._prefs.getBoolean("offer_valid_for_all", false);
        return this.offer_valid_for_all;
    }


    public String getOffer_URL() {
        if (this._prefs == null) {
            return "";
        }
        this.offer_URL = this._prefs.getString("offer_URL", offer_URL);
        return this.offer_URL;
    }

    public void setOffer_URL(String offer_URL) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("offer_URL", offer_URL);
    }


    public String getForgotUrl() {
        if (this._prefs == null) {
            return "";
        }
        this.forgotUrl = this._prefs.getString("forgotUrl", forgotUrl);
        return this.forgotUrl;
    }

    public void setForgotUrl(String forgotUrl) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("forgotUrl", forgotUrl);
    }


    public String getPayPalClientID() {
        if (this._prefs == null) {
            return "";
        }

        this.payPalClientID = this._prefs.getString("payPalClientID", payPalClientID);
        return this.payPalClientID;
    }

    public void setPayPalClientID(String clientID) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("payPalClientID", clientID);
    }

    public String getUsernameForPurchase() {
        if (this._prefs == null) {
            return "";
        }
        this.usernameForPurchase = this._prefs.getString("usernameForPurchase", usernameForPurchase);
        return this.usernameForPurchase;
    }

    public void setUsernameForPurchase(String usernameForPurchase) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("usernameForPurchase", usernameForPurchase);
    }


    public String getTransaction_id() {
        if (this._prefs == null) {
            return "";
        }
        this.transaction_id = this._prefs.getString("transaction_id", transaction_id);
        return this.transaction_id;
    }


    public void setTransaction_id(String transaction_id) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("transaction_id", transaction_id);
    }

    public String getTransactionType() {
        if (this._prefs == null) {
            return "";
        }
        this.transactionType = this._prefs.getString("transactionType", transactionType);
        return this.transactionType;
    }

    public String getAmazon_receipt() {
        if (this._prefs == null) {
            return "";
        }
        this.amazon_receipt = this._prefs.getString("amazon_receipt", amazon_receipt);
        return this.amazon_receipt;
    }


    public void setAmazon_receipt(String amazon_receipt) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("amazon_receipt", amazon_receipt);
    }

    public String getGoogle_purchase_token() {
        if (this._prefs == null) {
            return "";
        }
        this.google_purchase_token = this._prefs.getString("google_purchase_token", google_purchase_token);
        return this.google_purchase_token;
    }


    public void setGoogle_purchase_token(String google_purchase_token) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("google_purchase_token", google_purchase_token);
    }

    public void setTransactionType(String transactionType) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("transactionType", transactionType);
    }


    public String getPrice() {
        if (this._prefs == null) {
            return "";
        }
        this.price = this._prefs.getString("price", price);
        return this.price;
    }

    public void setPrice(String price) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("price", price);
    }


    public void setPurchasePending(boolean PurchasePending) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("PurchasePending", PurchasePending);
    }

    public boolean isPurchasePending() {
        if (this._prefs == null) {
            return false;
        }

        this.PurchasePending = this._prefs.getBoolean("PurchasePending", false);
        return this.PurchasePending;
    }

    public void setFreeMinPending(boolean freeMinPending) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("freeMinPending", freeMinPending);
    }

    public boolean isFreeMinPending() {
        if (this._prefs == null) {
            return false;
        }

        this.freeMinPending = this._prefs.getBoolean("freeMinPending", false);
        return this.freeMinPending;
    }

    public long getRemainingFreeMin() {
        if (this._prefs == null) {
            return 0;
        }

        this.remainingFreeMin = this._prefs.getLong("remainingFreeMin", remainingFreeMin);
        return this.remainingFreeMin;
    }

    public void setRemainingFreeMin(long remainingFreeMin) {
        if (this._editor == null) {
            return;
        }

        this._editor.putLong("remainingFreeMin", remainingFreeMin);
    }

    public String getPricing() {
        if (this._prefs == null) {
            return "";
        }
        this.pricing = this._prefs.getString("pricing", pricing);
        return this.pricing;
    }

    public void setPricing(String pricing) {
        if (this._editor == null) {
            return;
        }


        this._editor.putString("pricing", pricing);
    }

    public String getPricingOnline() {
        if (this._prefs == null) {
            return "";
        }
        this.pricingOnline = this._prefs.getString("pricingOnline", pricingOnline);
        return this.pricingOnline;
    }

    public void setPricingOnline(String pricingOnline) {
        if (this._editor == null) {
            return;
        }


        this._editor.putString("pricingOnline", pricingOnline);
    }

    public void setShouldshowPurchaseAlert(boolean shouldshowPurchaseAlert) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("shouldshowPurchaseAlert", shouldshowPurchaseAlert);
    }

    public boolean shouldShowPurchaseAlert() {
        if (this._prefs == null) {
            return false;
        }

        this.shouldshowPurchaseAlert = this._prefs.getBoolean("shouldshowPurchaseAlert", false);
        return this.shouldshowPurchaseAlert;
    }

    public void setUsingNewListUI(boolean isUsingNewListUI) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("isUsingNewListUI", isUsingNewListUI);
    }

    public boolean isUsingNewListUI() {
        if (this._prefs == null) {
            return false;
        }

        this.isUsingNewListUI = this._prefs.getBoolean("isUsingNewListUI", this.isUsingNewListUI);
        return this.isUsingNewListUI;
    }

    public String getUserStatus() {
        if (this._prefs == null) {
            return "";
        }
        this.userStatus = this._prefs.getString("userStatus", userStatus);
        return this.userStatus;
    }

    public void setUserStatus(String userStatus) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("userStatus", userStatus);
    }

    public String getSkuIDs() {
        if (this._prefs == null) {
            return "";
        }

        this.skuIDs = this._prefs.getString("skuIDs", skuIDs);
        return this.skuIDs.equals("") ? "one_month_subs,three_months_subs,six_months_subs,one_year_subs" : this.skuIDs;
        //return this.skuIDs;
    }


    public String getPremium_features_list() {
        if (this._prefs == null) {
            return "";
        }

        this.premium_features_list = this._prefs.getString("premium_features_list", premium_features_list);
        return this.premium_features_list;
        //return this.skuIDs;
    }

    public void setPremium_features_list(List<String> premium_features_list) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("premium_features_list", new Gson().toJson(premium_features_list));
        this.save();
    }

    public long getNextRefreshTime() {
        if (this._prefs == null) {
            return 0;
        }

        this.nextRefreshTime = this._prefs.getLong("nextRefreshTime", nextRefreshTime);
        return this.nextRefreshTime;
    }

    public void setNextRefreshTime(long nextRefreshTime) {
        if (this._editor == null) {
            return;
        }

        this._editor.putLong("nextRefreshTime", nextRefreshTime);
    }

    public long getNextPushUpdateTime() {
        if (this._prefs == null) {
            return 0;
        }

        this.nextPushUpdateTime = this._prefs.getLong("nextPushUpdateTime", nextPushUpdateTime);
        return this.nextPushUpdateTime;
    }

    public void setNextPushUpdateTime(long nextPushUpdateTime) {
        if (this._editor == null) {
            return;
        }

        this._editor.putLong("nextPushUpdateTime", nextPushUpdateTime);
    }

    public void setNewSignUp(boolean newSignUp) {
        if (this._editor == null) {
            return;
        }
        this._editor.putBoolean("newSignUp", newSignUp);
    }

    public boolean isNewSignUp() {

        if (this._prefs == null) {
            return false;
        }
        this.newSignUp = this._prefs.getBoolean("newSignUp", false);
        return this.newSignUp;
    }

    public void setTos(boolean tos) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("tos", tos);
    }

    public boolean isTos() {

        if (this._prefs == null) {
            return false;
        }

        this.tos = this._prefs.getBoolean("tos", false);
        return this.tos;
    }

    public String getNextAdTime() {
        if (this._prefs == null) {
            return "";
        }

        this.nextAdTime = this._prefs.getString("nextAdTime", nextAdTime);
        return this.nextAdTime;
    }

    public void setNextAdTime(String nextAdTime) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("nextAdTime", nextAdTime);
    }

    public UserDefaults(Context context) {
        this._prefs = context.getSharedPreferences("PREFS_PRIVATE", Context.MODE_PRIVATE);
        this._editor = this._prefs.edit();
    }

    public String getUdid() {
        if (this._prefs == null) {
            return "";
        }

        this.udid = this._prefs.getString("udid", udid);
        return this.udid;
    }

    public void setUdid(String udid) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("udid", udid);
    }


    public String getUserType() {
        if (this._prefs == null) {
            return "";
        }

        this.userType = this._prefs.getString("userType", userType);
        return this.userType;
    }

    public void setUserType(String userType) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("userType", userType);
    }


    public void setSelectedServerPosition(int selectedServerPosition) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("selectedServerPosition", selectedServerPosition);
    }

    public int getSelectedServerPosition() {
        if (this._prefs == null) {
            return 0;
        }

        this.selectedServerPosition = this._prefs.getInt("selectedServerPosition", selectedServerPosition);
        return this.selectedServerPosition;
    }

    public void setListSortingType(int sortingType) {
        if (this._editor == null) {
            return;
        }

        this._editor.putInt("listSortingType", sortingType);
    }

    public int getListSortingType() {
        if (this._prefs == null) {
            return 1;
        }

        this.listSortingType = this._prefs.getInt("listSortingType", listSortingType);
        return this.listSortingType;
    }


    public String getServer() {
        if (this._prefs == null) {
            return "";
        }

        this.server = this._prefs.getString("server", server);
        return this.server;
    }

    public void setServer(String server) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("server", server);
    }

    public String getServerList() {
        if (this._prefs == null) {
            return "";
        }

        this.serverList = this._prefs.getString("serverList", serverList);
        return this.serverList;
    }

    public void setServerList(String serverList) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("serverList", serverList);
    }

    String recentServerData = "";


    public String getInAppPackagesList() {
        if (this._prefs == null) {
            return "";
        }

        this.inAppPackagesList = this._prefs.getString("inAppPackagesList", inAppPackagesList);
        return this.inAppPackagesList;
        // return "[{\"id\":1,\"name\":\"1 Month\",\"price\":2.99,\"sku_ids\":\"one_month_subs\",\"sub_title\":\"Economic Pack\",\"highlighted_text\":\"Basic Pack\",\"feature_title\":\"\"},{\"id\":2,\"name\":\"3 Months\",\"price\":7.99,\"sku_ids\":\"three_month_subs\",\"sub_title\":\"$2.6633333333333\\/month\",\"highlighted_text\":\"\",\"feature_title\":\"\"},{\"id\":3,\"name\":\"6 Months\",\"price\":14.99,\"sku_ids\":\"six_months_subs\",\"sub_title\":\"$2.4983333333333\\/month\",\"highlighted_text\":\"\",\"feature_title\":\"\"},{\"id\":4,\"name\":\"1 Year\",\"price\":24.99,\"sku_ids\":\"one_year_subs\",\"sub_title\":\"$2.0825\\/month\",\"highlighted_text\":\"\",\"feature_title\":\"\"}]";
    }

    public void setInAppPackagesList(String inAppPackagesList) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("inAppPackagesList", inAppPackagesList);
    }


    public String getCardPaymentsList() {
        if (this._prefs == null) {
            return "";
        }

        this.cardPaymentsList = this._prefs.getString("cardPaymentsList", cardPaymentsList);
        return this.cardPaymentsList;
    }

    public void setCardPaymentsList(String cardPaymentsList) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("cardPaymentsList", cardPaymentsList);
    }

    public String getAmazonPackagesList() {
        if (this._prefs == null) {
            return "";
        }

        this.amazonPackagesList = this._prefs.getString("amazonPackagesList", amazonPackagesList);
        return this.amazonPackagesList;
    }

    public void setAmazonPackagesList(String amazonPackagesList) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("amazonPackagesList", amazonPackagesList);
    }


    public String getInAppHuaweiPackagesList() {
        if (this._prefs == null) {
            return "";
        }

        this.inAppHuaweiPackages = this._prefs.getString("inAppHuaweiPackages", inAppHuaweiPackages);
        return this.inAppHuaweiPackages;
    }

    public void setInAppHuaweiPackagesList(String inAppHuaweiPackages) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("inAppHuaweiPackages", inAppHuaweiPackages);
    }

  /*  public String getPremiumFeaturesList() {
        if (this._prefs == null) {
            return "";
        }

        this.premiumFeaturesList = this._prefs.getString("premiumFeaturesList", premiumFeaturesList);
        return this.premiumFeaturesList;
    }

    public void setPremiumFeaturesList(String premiumFeaturesList) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("premiumFeaturesList", premiumFeaturesList);
    }

    public String getFeatureImgOffer() {
        if (this._prefs == null) {
            return "";
        }

        this.feature_img_offer = this._prefs.getString("feature_img_offer", feature_img_offer);
        return this.feature_img_offer;
    }*/

    public void setFeatureImgOffer(String feature_img_offer) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("feature_img_offer", feature_img_offer);
    }

    public String getFeatureUrlOffer() {
        if (this._prefs == null) {
            return "";
        }

        this.feature_url_offer = this._prefs.getString("feature_url_offer", feature_url_offer);
        return this.feature_url_offer;
    }

    public void setFeatureUrlOffer(String feature_url_offer) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("feature_url_offer", feature_url_offer);
    }


    public String getSignUpURL() {
        if (this._prefs == null) {
            return "";
        }

        this.signUpURL = this._prefs.getString("signUpURL", signUpURL);
        return this.signUpURL;
    }

    public void setSignUpURL(String signUpURL) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("signUpURL", signUpURL);
    }

    public String getPaymentURL() {
        if (this._prefs == null) {
            return "";
        }

        this.paymentURL = this._prefs.getString("paymentURL", paymentURL);
        return this.paymentURL;
    }

    public void setPaymentURL(String paymentURL) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("paymentURL", paymentURL);

    }

    public String getServerSyncUrl() {
        if (this._prefs == null) {
            return "";
        }

        this.serverSyncUrl = this._prefs.getString("serverSyncUrl", serverSyncUrl);
        return this.serverSyncUrl;
    }


    public void setServerSyncUrl(String serverSyncUrl) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("serverSyncUrl", serverSyncUrl);

        this._editor.putString("serverSyncUrl", serverSyncUrl);
    }

    public String getDeviceInfoURL() {
        if (this._prefs == null) {
            return "";
        }

        this.deviceInfoURL = this._prefs.getString("deviceInfoURL", deviceInfoURL);
        return this.deviceInfoURL;
    }

    public void setDeviceInfoURL(String deviceInfoURL) {
        if (this._editor == null) {
            return;
        }
        this._editor.putString("deviceInfoURL", deviceInfoURL);
    }

    public String getConfigURL() {
        if (this._prefs == null) {
            return "";
        }

        this.configURL_v3 = this._prefs.getString("configURL_v3", configURL_v3);
        return this.configURL_v3;
    }

    public void setConfigURL(String configURL_v3) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("configURL_v3", configURL_v3);
    }

    public String getOpenvpnServer() {
        if (this._prefs == null) {
            return "";
        }

        this.openvpnServer = this._prefs.getString("openvpnServer", openvpnServer);
        return this.openvpnServer;
    }

    public void setOpenvpnServer(String openvpnServer) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("openvpnServer", openvpnServer);
    }

    public String getRemainingDays() {
        if (this._prefs == null) {
            return "";
        }

        this.remainingDays = this._prefs.getString("remainingDays", remainingDays);
        return this.remainingDays;
    }

    public void setRemainingDays(String days) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("remainingDays", days);
    }

    public String getAnyConnectServer() {
        if (this._prefs == null) {
            return "";
        }

        this.anyConnectServer = this._prefs.getString("anyConnectServer", anyConnectServer);
        return this.anyConnectServer;
    }

    public void setAnyConnectServer(String anyConnectServer) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("anyConnectServer", anyConnectServer);
    }

    public String getUserName() {
        if (this._prefs == null) {
            return "";
        }

        this.userName = this._prefs.getString("userName", userName);
        return this.userName;
    }

    public void setUserName(String name) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("userName", name);
    }

    public String getPassword() {
        if (this._prefs == null) {
            return "";
        }

        this.password = this._prefs.getString("password", password);
        return this.password;
    }

    public void setPassword(String password) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("password", password);
    }

    public void setLoggedIn(boolean isLoggedIn) {
        if (this._editor == null) {
            return;
        }

        this._editor.putBoolean("isLoggedIn", isLoggedIn);
    }

    public boolean isLoggedIn() {

        if (this._prefs == null) {
            return false;
        }

        this.isLoggedIn = this._prefs.getBoolean("isLoggedIn", false);
        return this.isLoggedIn;
    }


    public String getValidity() {
        if (this._prefs == null) {
            return "";
        }

        this.validity = this._prefs.getString("validity", validity);
        return this.validity;
    }

    public void setValidity(String validity) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("validity", validity);
    }

    public String getExpiredAt() {
        if (this._prefs == null) {
            return "";
        }

        this.validity = this._prefs.getString("expiredAt", expiredAt);
        return this.validity;
    }

    public void setExpiredAt(String expiredAt) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("expiredAt", expiredAt);
    }

    public String getSni() {
        if (this._prefs == null) {
            return "";
        }
        this.sni = this._prefs.getString("sni", sni);
        return this.sni;
    }

    public void setSni(String sni) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("sni", sni);
    }

    public void setBlockPackage(String blockPackage) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("blockPackage", blockPackage);
    }

    public String getStartedSessionDate() {
        if (this._prefs == null) {
            return "";
        }
        this.startDate = this._prefs.getString("startDate", startDate);
        return this.startDate;
    }

    public void setStartedSessionDate(String startDate) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("startDate", startDate);
    }

    public String getSessionByte() {
        if (this._prefs == null) {
            return "";
        }
        this.sessionByte = this._prefs.getString("sessionByte", sessionByte);
        return this.sessionByte;
    }

    public void setSessionByte(String sessionByte) {
        if (this._editor == null) {
            return;
        }

        this._editor.putString("sessionByte", sessionByte);
    }

    /* For save to ZemSettings */
    public void save() {
        if (this._editor == null) {
            return;
        }
        this._editor.commit();
    }


    public String getWgConfigUrl() {
        if (this._prefs == null) {
            return "";
        }

        this.wgConfigUrl = this._prefs.getString("wgConfigUrl", wgConfigUrl);
        return this.wgConfigUrl;
    }

}
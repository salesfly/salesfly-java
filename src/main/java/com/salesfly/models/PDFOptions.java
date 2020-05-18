package com.salesfly.models;

import com.google.gson.annotations.SerializedName;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.HttpMultipartMode;

/**
 * APIUsage model.
 */
public class PDFOptions {
    /**
     * Number of allowed requests
     */
    @SerializedName("document_url")
    private String documentURL;

    /**
     * Number of used requests
     */
    @SerializedName("document_html")
    private String documentHTML;

    /**
     * Name of the returned document.Defaults to'document.
     */
    @SerializedName("document_name")
    public String documentName;

    /**
     * Top margin, accepts values labeled with units. Example: '20mm'.
     */
    @SerializedName("margin_top")
    public String marginTop;

    /**
     * Bottom margin, accepts values labeled with units.
     */
    @SerializedName("margin_bottom")
    public String marginBottom;

    /**
     * Left margin, accepts values labeled with units.
     */
    @SerializedName("margin_left")
    public String marginLeft;

    /**
     * Right margin, accepts values labeled with units.
     */
    @SerializedName("margin_right")
    public String marginRight;

    /**
     * Paper orientation: 'landscape' or 'portrait'. Defaults to 'portrait'.
     */
    @SerializedName("orientation")
    public String orientation;

    /**
     * Paper format. Defaults to 'A4'.
     */
    @SerializedName("page_format")
    public String pageFormat;

    /**
     * Paper width, accepts values labeled with units. If set together with ///
     * PageHeight, takes priority over PageFormat.
     */
    @SerializedName("page_width")
    public String pageWidth;

    /**
     * Paper height, accepts values labeled with units. If set together with ///
     * PageWidth, takes priority over PageFormat.
     */
    @SerializedName("page_height")
    public String pageHeight;

    /**
     * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty String,
     * /// which means print all pages.
     */
    @SerializedName("page_ranges")
    public String pageRanges;

    /**
     * Scale of the webpage rendering. Defaults to 1. Scale amount must be between
     * /// 0.1 and 2.
     */
    @SerializedName("scale")
    public Double scale;

    /**
     * Header text to be displayed at the top of each page.
     */
    @SerializedName("header_text")
    public String headerText;

    /**
     * Header alignment: 'left', 'center' or 'right'. Defaults to 'center.
     */
    @SerializedName("header_align")
    public String headerAlign;

    /**
     * Left and right margin for header (only applied when using HeaderText).
     */
    @SerializedName("header_margin")
    public Integer headerMargin;

    /**
     * HTML template for the header.
     */
    @SerializedName("header_html")
    public String headerHTML;

    /**
     * A URL pointing to a HTML template for the header.
     */
    @SerializedName("header_url")
    public String headerURL;

    /**
     * Footer text to be displayed at the bottom of each page.
     */
    @SerializedName("footer_text")
    public String footerText;

    /**
     * Footer alignment: 'left', 'center' or 'right'. Defaults to 'center.
     */
    @SerializedName("footer_align")
    public String footerAlign;

    /**
     * Left and right margin for footer (only applied using FooterText).
     */
    @SerializedName("footer_margin")
    public Integer footerMargin;

    /**
     * HTML template for the footer.
     */
    @SerializedName("footer_html")
    public String footerHTML;

    /**
     * A URL pointing to a HTML template for the footer.
     */
    @SerializedName("footer_url")
    public String footerURL;

    /**
     * Print background graphics. Defaults to false.
     */
    @SerializedName("print_background")
    public Boolean printBackground;

    /**
     * Give any CSS @page size declared in the page priority over what is declared
     * /// in `width` and `height` or `format` options. Defaults to false, which
     * will /// scale the content to fit the paper size.
     */
    @SerializedName("prefer_css_page_size")
    public Boolean preferCSSPageSize;

    /**
     * A URL pointing to a PNG or JPEG image that will be used as a watermark.
     */
    @SerializedName("watermark_url")
    public String watermarkURL;

    /**
     * A String telling where to place the watermark on the page: 'topleft', ///
     * 'topright', 'center', 'bottomleft', 'bottomright'. Defaults to 'center'.
     */
    @SerializedName("watermark_position")
    public String watermarkPosition;

    /**
     * The number of pixels to shift the watermark image horizontally. Offset is
     * given in pixels. Defaults to 0.
     */
    @SerializedName("watermark_offset_x")
    public Integer watermarkOffsetX;

    /**
     * The number of pixels to shift the watermark image vertically. Offset is given
     * in pixels. Defaults to 0.
     */
    @SerializedName("watermark_offset_y")
    public Integer watermarkOffsetY;

    /**
     * The title of this document.
     */
    @SerializedName("title")
    public String title;

    /**
     * The author of this document.
     */
    @SerializedName("author")
    public String author;

    /**
     * The creator of this document.
     */
    @SerializedName("creator")
    public String creator;

    /**
     * The subject of this document.
     */
    @SerializedName("subject")
    public String subject;

    /**
     * An array of keywords associated with this document.
     */
    @SerializedName("keywords")
    public String[] keywords;

    /**
     * A RFC 3066 language-tag denoting the language of this document, or an empty
     * /// String if the language is unknown.
     */
    @SerializedName("language")
    public String language;

    /**
     * Encrypt the PDF document using one of following algorithms: 'aes-256',
     * 'aes-128', 'rc4-128' or 'rc4-40'.
     */
    @SerializedName("encryption")
    public String encryption;

    /**
     * Set the owner password (required when encryption is enabled).
     */
    @SerializedName("owner_password")
    public String ownerPassword;

    /**
     * Set the user password.
     */
    @SerializedName("user_password")
    public String userPassword;

    /**
     * Set user permissions 'all' or 'none'. Defaults to 'all'.
     */
    @SerializedName("permissions")
    public String permissions;

    /**
     * Class constructor.
     */
    public PDFOptions() {
        this.documentURL = null;
        this.documentHTML = null;
        this.documentName = null;
        this.marginTop = null;
        this.marginBottom = null;
        this.marginLeft = null;
        this.marginRight = null;
        this.orientation = null;
        this.pageFormat = null;
        this.pageWidth = null;
        this.pageHeight = null;
        this.pageRanges = null;
        this.scale = null;
        this.headerText = null;
        this.headerAlign = null;
        this.headerMargin = null;
        this.headerHTML = null;
        this.headerURL = null;
        this.footerText = null;
        this.footerAlign = null;
        this.footerMargin = null;
        this.footerHTML = null;
        this.footerURL = null;
        this.printBackground = null;
        this.preferCSSPageSize = null;
        this.watermarkURL = null;
        this.watermarkPosition = null;
        this.watermarkOffsetX = null;
        this.watermarkOffsetY = null;
        this.title = null;
        this.author = null;
        this.creator = null;
        this.subject = null;
        this.keywords = null;
        this.language = null;
        this.encryption = null;
        this.ownerPassword = null;
        this.userPassword = null;
        this.permissions = null;
    }

    /**
     * Set the document URL
     * 
     * @param documentURL the the document URL to set.
     */
    public void setDocumentURL(final String documentURL) {
        this.documentURL = documentURL;
    }

    /**
     * Get the document URL
     * 
     * @return URL String
     */
    public String getDocumentURL() {
        return this.documentURL;
    }

    /**
     * Set the document HTML
     * 
     * @param documentHTML the the document HTML to set.
     */
    public void setDocumentHTML(final String documentHTML) {
        this.documentHTML = documentHTML;
    }

    /**
     * Get the document HTML
     * 
     * @return HTML String
     */
    public String getDocumentHTML() {
        return this.documentHTML;
    }

    /**
     * Set the document name
     * 
     * @param name the the document HTML to set.
     */
    public void setDocumentName(final String name) {
        this.documentName = name;
    }

    /**
     * Get the document name
     * 
     * @return document name
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Set the top margin
     * 
     * @param margin to set.
     */
    public void setMarginTop(final String margin) {
        this.marginTop = margin;
    }

    /**
     * Get the top margin
     * 
     * @return top margin
     */
    public String getMarginTop() {
        return this.marginTop;
    }

    /**
     * Set the bottom margin
     * 
     * @param margin to set.
     */
    public void setMarginBottom(final String margin) {
        this.marginBottom = margin;
    }

    /**
     * Get the top margin
     * 
     * @return top margin
     */
    public String getMarginBottom() {
        return this.marginBottom;
    }

    /**
     * Set the left margin
     * 
     * @param margin to set.
     */
    public void setMarginLeft(final String margin) {
        this.marginLeft = margin;
    }

    /**
     * Get the left margin
     * 
     * @return left margin
     */
    public String getMarginLeft() {
        return this.marginLeft;
    }

    /**
     * Set the right margin
     * 
     * @param margin to set.
     */
    public void setMarginRight(final String margin) {
        this.marginRight = margin;
    }

    /**
     * Get the right margin
     * 
     * @return right margin
     */
    public String getMarginRight() {
        return this.marginRight;
    }

    /**
     * Set the orientation
     * 
     * @param orientation to set.
     */
    public void setOrientation(final String orientation) {
        this.orientation = orientation;
    }

    /**
     * Get the orientation
     * 
     * @return orientation
     */
    public String getOrientation() {
        return this.orientation;
    }

    /**
     * Set the page format
     * 
     * @param format to set.
     */
    public void setPageFormat(final String format) {
        this.pageFormat = format;
    }

    /**
     * Get the page format
     * 
     * @return format
     */
    public String getPageFormat() {
        return this.pageFormat;
    }

    /**
     * Set the page width
     * 
     * @param width to set.
     */
    public void setPageWidth(final String width) {
        this.pageWidth = width;
    }

    /**
     * Get the page width
     * 
     * @return page width
     */
    public String getPageWidth() {
        return this.pageWidth;
    }

    /**
     * Set the page height
     * 
     * @param height to set.
     */
    public void setPageHeight(final String height) {
        this.pageHeight = height;
    }

    /**
     * Get the page height
     * 
     * @return page height
     */
    public String getPageHeight() {
        return this.pageHeight;
    }

    ///
    /// Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty String,
    /// which means print all pages.
    ///

    /**
     * Set the page ranges
     * 
     * @param ranges to set.
     */
    public void setPageRanges(final String ranges) {
        this.pageRanges = ranges;
    }

    /**
     * Get the page ranges
     * 
     * @return page ranges
     */
    public String getPageRanges() {
        return this.pageRanges;
    }

    /**
     * Set the scale
     * 
     * @param scale to set.
     */
    public void setScale(final double scale) {
        this.scale = scale;
    }

    /**
     * Get the scale
     * 
     * @return scale
     */
    public double getScale() {
        return this.scale;
    }

    /**
     * Set the header text
     * 
     * @param text to set.
     */
    public void setHeaderText(final String text) {
        this.headerText = text;
    }

    /**
     * Get the header text
     * 
     * @return header text
     */
    public String getHeaderText() {
        return this.headerText;
    }

    /**
     * Set the header alignment
     * 
     * @param alignment to set.
     */
    public void setHeaderAlign(final String alignment) {
        this.headerAlign = alignment;
    }

    /**
     * Get the header alignment
     * 
     * @return header alignment
     */
    public String getHeaderAlign() {
        return this.headerAlign;
    }

    /**
     * Set the header margin
     * 
     * @param margin to set.
     */
    public void setHeaderAlign(final int margin) {
        this.headerMargin = margin;
    }

    /**
     * Get the header margin
     * 
     * @return header alimargingnment
     */
    public int getHeaderMargin() {
        return this.headerMargin;
    }

    /**
     * Set the header HTML
     * 
     * @param html to set.
     */
    public void setHeaderHTML(final String html) {
        this.headerHTML = html;
    }

    /**
     * Get the header HTML
     * 
     * @return header HTML
     */
    public String getHeaderHTML() {
        return this.headerHTML;
    }

    /**
     * Set the header URL
     * 
     * @param url to set.
     */
    public void setHeaderURL(final String url) {
        this.headerURL = url;
    }

    /**
     * Get the header URL
     * 
     * @return header URL
     */
    public String getHeaderURL() {
        return this.headerURL;
    }

    /// --------------------------

    /**
     * Set the footer text
     * 
     * @param text to set.
     */
    public void setFooterText(final String text) {
        this.footerText = text;
    }

    /**
     * Get the footer text
     * 
     * @return footer text
     */
    public String getFooterText() {
        return this.footerText;
    }

    /**
     * Set the footer alignment
     * 
     * @param alignment to set.
     */
    public void setFooterAlign(final String alignment) {
        this.footerAlign = alignment;
    }

    /**
     * Get the footer alignment
     * 
     * @return footer alignment
     */
    public String getFooterAlign() {
        return this.footerAlign;
    }

    /**
     * Set the footer margin
     * 
     * @param margin to set.
     */
    public void setFooterAlign(final int margin) {
        this.footerMargin = margin;
    }

    /**
     * Get the footer margin
     * 
     * @return footer alimargingnment
     */
    public int getFooterMargin() {
        return this.footerMargin;
    }

    /**
     * Set the footer HTML
     * 
     * @param html to set.
     */
    public void setFooterHTML(final String html) {
        this.footerHTML = html;
    }

    /**
     * Get the footer HTML
     * 
     * @return footer HTML
     */
    public String getFooterHTML() {
        return this.footerHTML;
    }

    /**
     * Set the footer URL
     * 
     * @param url to set.
     */
    public void setFooterURL(final String url) {
        this.footerURL = url;
    }

    /**
     * Get the footer URL
     * 
     * @return footer URL
     */
    public String getFooterURL() {
        return this.footerURL;
    }

    /**
     * Enable printing of background images.
     * 
     * @param flag to set.
     */
    public void setPrintBackground(final boolean flag) {
        this.printBackground = flag;
    }

    /**
     * Get print background
     * 
     * @return true if print background is enabled
     */
    public boolean getPrintBackground() {
        return this.printBackground;
    }

    /**
     * Set prefer CSS page size.
     * 
     * @param flag to set.
     */
    public void setPreferCSSPageSize(final boolean flag) {
        this.preferCSSPageSize = flag;
    }

    /**
     * Set prefer CSS page size
     * 
     * @return true if prefer CSS page size
     */
    public boolean getPreferCSSPageSize() {
        return this.preferCSSPageSize;
    }

    /**
     * Set the watermark URL
     * 
     * @param url to set.
     */
    public void setWatermarkURL(final String url) {
        this.watermarkURL = url;
    }

    /**
     * Get the watermark URL
     * 
     * @return watermark URL
     */
    public String getWatermarkURL() {
        return this.watermarkURL;
    }

    /**
     * Set the watermark position
     * 
     * @param position to set.
     */
    public void setWatermarkPosition(final String position) {
        this.watermarkPosition = position;
    }

    /**
     * Get the watermark position
     * 
     * @return watermark position
     */
    public String getWatermarkPosition() {
        return this.watermarkPosition;
    }

    /**
     * Set the watermark offset x
     * 
     * @param offset to set.
     */
    public void setWatermarkOffsetX(final int offset) {
        this.watermarkOffsetX = offset;
    }

    /**
     * Get the watermark offset x
     * 
     * @return watermark offset
     */
    public int getWatermarkOffsetX() {
        return this.watermarkOffsetX;
    }

    /**
     * Set the watermark offset y
     * 
     * @param offset to set.
     */
    public void setWatermarkOffsetY(final int offset) {
        this.watermarkOffsetY = offset;
    }

    /**
     * Get the watermark offset y
     * 
     * @return watermark offset
     */
    public int getWatermarkOffsetY() {
        return this.watermarkOffsetY;
    }

    /**
     * Set the title
     * 
     * @param title to set.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Get the title
     * 
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the author
     * 
     * @param author to set.
     */
    public void setAuthor(final String author) {
        this.author = author;
    }

    /**
     * Get the author
     * 
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Set the creator
     * 
     * @param creator to set.
     */
    public void setCreator(final String creator) {
        this.creator = creator;
    }

    /**
     * Get the creator
     * 
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * Set the subject
     * 
     * @param subject to set.
     */
    public void setSubject(final String subject) {
        this.subject = subject;
    }

    /**
     * Get the subject
     * 
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the keywords
     * 
     * @param keywords to set.
     */
    public void setKeywords(final String[] keywords) {
        this.keywords = keywords;
    }

    /**
     * Get the keywords
     * 
     * @return keywords
     */
    public String[] getKeywords() {
        return this.keywords;
    }

    /**
     * Set the language
     * 
     * @param language to set.
     */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
     * Get the language
     * 
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the encryption
     * 
     * @param encryption to set.
     */
    public void setEncryption(final String encryption) {
        this.encryption = encryption;
    }

    /**
     * Get the encryption
     * 
     * @return encryption
     */
    public String getEncryption() {
        return this.encryption;
    }

    /**
     * Set the owner password
     * 
     * @param password to set.
     */
    public void setOwnerPassword(final String password) {
        this.ownerPassword = password;
    }

    /**
     * Get the owner password
     * 
     * @return password
     */
    public String getOwnerPassword() {
        return this.ownerPassword;
    }

    /**
     * Set the user password
     * 
     * @param password to set.
     */
    public void setUserPassword(final String password) {
        this.userPassword = password;
    }

    /**
     * Get the user password
     * 
     * @return password
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    /**
     * Set the permissions
     * 
     * @param permissions to set.
     */
    public void setPermissions(final String permissions) {
        this.userPassword = permissions;
    }

    /**
     * Get the permissions
     * 
     * @return permissions
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Creates a multipart form from object.
     * 
     * @return http entity
     */
    public HttpEntity asFormContent() {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

        if (this.documentHTML != null) {
            builder.addTextBody("document_html", this.documentHTML, ContentType.TEXT_PLAIN);
        }
        if (this.documentURL != null) {
            builder.addTextBody("document_url", this.documentURL, ContentType.TEXT_PLAIN);
        }
        if (this.documentName != null) {
            builder.addTextBody("document_name", this.documentName, ContentType.TEXT_PLAIN);
        }
        if (this.marginTop != null) {
            builder.addTextBody("margin_top", this.marginTop, ContentType.TEXT_PLAIN);
        }
        if (this.marginBottom != null) {
            builder.addTextBody("margin_bottom", this.marginBottom, ContentType.TEXT_PLAIN);
        }
        if (this.marginLeft != null) {
            builder.addTextBody("margin_left", this.marginLeft, ContentType.TEXT_PLAIN);
        }
        if (this.marginRight != null) {
            builder.addTextBody("margin_right", this.marginRight, ContentType.TEXT_PLAIN);
        }
        if (this.orientation != null) {
            builder.addTextBody("orientation", this.orientation, ContentType.TEXT_PLAIN);
        }
        if (this.pageFormat != null) {
            builder.addTextBody("page_format", this.pageFormat, ContentType.TEXT_PLAIN);
        }
        if (this.pageWidth != null) {
            builder.addTextBody("page_width", this.pageWidth, ContentType.TEXT_PLAIN);
        }
        if (this.pageHeight != null) {
            builder.addTextBody("page_height", this.pageHeight, ContentType.TEXT_PLAIN);
        }
        if (this.pageRanges != null) {
            builder.addTextBody("page_ranges", this.pageRanges, ContentType.TEXT_PLAIN);
        }
        if (this.scale != null) {
            builder.addTextBody("scale", this.scale.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.headerText != null) {
            builder.addTextBody("header_text", this.headerText, ContentType.TEXT_PLAIN);
        }
        if (this.headerAlign != null) {
            builder.addTextBody("header_align", this.headerAlign, ContentType.TEXT_PLAIN);
        }
        if (this.headerMargin != null) {
            builder.addTextBody("header_margin", this.headerMargin.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.headerHTML != null) {
            builder.addTextBody("header_html", this.headerHTML, ContentType.TEXT_PLAIN);
        }
        if (this.headerURL != null) {
            builder.addTextBody("header_url", this.headerURL, ContentType.TEXT_PLAIN);
        }
        if (this.footerText != null) {
            builder.addTextBody("footer_text", this.footerText, ContentType.TEXT_PLAIN);
        }
        if (this.footerAlign != null) {
            builder.addTextBody("footer_align", this.footerAlign, ContentType.TEXT_PLAIN);
        }
        if (this.footerMargin != null) {
            builder.addTextBody("footer_margin", this.footerMargin.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.footerHTML != null) {
            builder.addTextBody("footer_html", this.footerHTML, ContentType.TEXT_PLAIN);
        }
        if (this.footerURL != null) {
            builder.addTextBody("footer_url", this.footerURL, ContentType.TEXT_PLAIN);
        }
        if (this.printBackground != null) {
            builder.addTextBody("print_background", this.printBackground.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.preferCSSPageSize != null) {
            builder.addTextBody("prefer_css_page_size", this.preferCSSPageSize.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.watermarkURL != null) {
            builder.addTextBody("watermark_url", this.watermarkURL, ContentType.TEXT_PLAIN);
        }
        if (this.watermarkPosition != null) {
            builder.addTextBody("watermark_position", this.watermarkPosition, ContentType.TEXT_PLAIN);
        }
        if (this.watermarkOffsetX != null) {
            builder.addTextBody("watermark_offset_x", this.watermarkOffsetX.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.watermarkOffsetY != null) {
            builder.addTextBody("watermark_offset_y", this.watermarkOffsetY.toString(), ContentType.TEXT_PLAIN);
        }
        if (this.title != null) {
            builder.addTextBody("title", this.title, ContentType.TEXT_PLAIN);
        }
        if (this.author != null) {
            builder.addTextBody("author", this.author, ContentType.TEXT_PLAIN);
        }
        if (this.creator != null) {
            builder.addTextBody("creator", this.creator, ContentType.TEXT_PLAIN);
        }
        if (this.subject != null) {
            builder.addTextBody("subject", this.subject, ContentType.TEXT_PLAIN);
        }
        for (String keyword : this.keywords) {
            builder.addTextBody("keywords", keyword, ContentType.TEXT_PLAIN);
        }
        if (this.language != null) {
            builder.addTextBody("language", this.language, ContentType.TEXT_PLAIN);
        }
        if (this.encryption != null) {
            builder.addTextBody("encryption", this.encryption, ContentType.TEXT_PLAIN);
        }
        if (this.ownerPassword != null) {
            builder.addTextBody("owner_password", this.ownerPassword, ContentType.TEXT_PLAIN);
        }
        if (this.userPassword != null) {
            builder.addTextBody("user_password", this.userPassword, ContentType.TEXT_PLAIN);
        }
        if (this.permissions != null) {
            builder.addTextBody("permissions", this.permissions, ContentType.TEXT_PLAIN);
        }

        return builder.build();
    }
}

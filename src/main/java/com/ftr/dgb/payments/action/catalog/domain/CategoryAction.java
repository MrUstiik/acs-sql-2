package com.ftr.dgb.payments.action.catalog.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;

import com.ftr.dgb.payments.action.catalog.domain.enumeration.ActionType;

/**
 * Payment transaction action.
 */
@Entity
@Table(name = "category_action")
public class CategoryAction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "uuid", nullable = false, unique = true)
    private UUID uuid;

    @Enumerated(EnumType.STRING)
    @Column(name = "action_type")
    private ActionType actionType;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    @NotNull
    @Column(name = "category_id", nullable = false)
    private UUID categoryId;

    @Size(min = 4, max = 4)
    @Column(name = "mcc", length = 4)
    private String mcc;

    @Column(name = "default_order_id")
    private Integer defaultOrderId;

    @Column(name = "icon_url")
    private String iconUrl;

    @Column(name = "regions")
    private String regions;

    @Column(name = "tags")
    private String tags;

    @Column(name = "source")
    private String source;

    @Column(name = "process_id")
    private String processId;

    @NotNull
    @Column(name = "added_date", nullable = false)
    private ZonedDateTime addedDate;

    @NotNull
    @Column(name = "updated_date", nullable = false)
    private ZonedDateTime updatedDate;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public CategoryAction uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public CategoryAction actionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public CategoryAction name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public CategoryAction enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public CategoryAction categoryId(UUID categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public String getMcc() {
        return mcc;
    }

    public CategoryAction mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public Integer getDefaultOrderId() {
        return defaultOrderId;
    }

    public CategoryAction defaultOrderId(Integer defaultOrderId) {
        this.defaultOrderId = defaultOrderId;
        return this;
    }

    public void setDefaultOrderId(Integer defaultOrderId) {
        this.defaultOrderId = defaultOrderId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public CategoryAction iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getRegions() {
        return regions;
    }

    public CategoryAction regions(String regions) {
        this.regions = regions;
        return this;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getTags() {
        return tags;
    }

    public CategoryAction tags(String tags) {
        this.tags = tags;
        return this;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getSource() {
        return source;
    }

    public CategoryAction source(String source) {
        this.source = source;
        return this;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProcessId() {
        return processId;
    }

    public CategoryAction processId(String processId) {
        this.processId = processId;
        return this;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public ZonedDateTime getAddedDate() {
        return addedDate;
    }

    public CategoryAction addedDate(ZonedDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    public void setAddedDate(ZonedDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public ZonedDateTime getUpdatedDate() {
        return updatedDate;
    }

    public CategoryAction updatedDate(ZonedDateTime updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(ZonedDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategoryAction)) {
            return false;
        }
        return id != null && id.equals(((CategoryAction) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CategoryAction{" +
            "id=" + getId() +
            ", uuid='" + getUuid() + "'" +
            ", actionType='" + getActionType() + "'" +
            ", name='" + getName() + "'" +
            ", enabled='" + isEnabled() + "'" +
            ", categoryId='" + getCategoryId() + "'" +
            ", mcc='" + getMcc() + "'" +
            ", defaultOrderId=" + getDefaultOrderId() +
            ", iconUrl='" + getIconUrl() + "'" +
            ", regions='" + getRegions() + "'" +
            ", tags='" + getTags() + "'" +
            ", source='" + getSource() + "'" +
            ", processId='" + getProcessId() + "'" +
            ", addedDate='" + getAddedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }
}

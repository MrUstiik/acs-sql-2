package com.ftr.dgb.payments.action.catalog.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.UUIDFilter;
import io.github.jhipster.service.filter.ZonedDateTimeFilter;

/**
 * Criteria class for the {@link com.ftr.dgb.payments.action.catalog.domain.Category} entity. This class is used
 * in {@link com.ftr.dgb.payments.action.catalog.web.rest.CategoryResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /categories?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class CategoryCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private UUIDFilter uuid;

    private StringFilter name;

    private BooleanFilter enabled;

    private UUIDFilter parentCategoryId;

    private StringFilter mcc;

    private StringFilter iconUrl;

    private IntegerFilter defaultOrderId;

    private StringFilter regions;

    private StringFilter tags;

    private ZonedDateTimeFilter addedDate;

    private ZonedDateTimeFilter updatedDate;

    public CategoryCriteria() {
    }

    public CategoryCriteria(CategoryCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.uuid = other.uuid == null ? null : other.uuid.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.enabled = other.enabled == null ? null : other.enabled.copy();
        this.parentCategoryId = other.parentCategoryId == null ? null : other.parentCategoryId.copy();
        this.mcc = other.mcc == null ? null : other.mcc.copy();
        this.iconUrl = other.iconUrl == null ? null : other.iconUrl.copy();
        this.defaultOrderId = other.defaultOrderId == null ? null : other.defaultOrderId.copy();
        this.regions = other.regions == null ? null : other.regions.copy();
        this.tags = other.tags == null ? null : other.tags.copy();
        this.addedDate = other.addedDate == null ? null : other.addedDate.copy();
        this.updatedDate = other.updatedDate == null ? null : other.updatedDate.copy();
    }

    @Override
    public CategoryCriteria copy() {
        return new CategoryCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public UUIDFilter getUuid() {
        return uuid;
    }

    public void setUuid(UUIDFilter uuid) {
        this.uuid = uuid;
    }

    public StringFilter getName() {
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public BooleanFilter getEnabled() {
        return enabled;
    }

    public void setEnabled(BooleanFilter enabled) {
        this.enabled = enabled;
    }

    public UUIDFilter getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(UUIDFilter parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public StringFilter getMcc() {
        return mcc;
    }

    public void setMcc(StringFilter mcc) {
        this.mcc = mcc;
    }

    public StringFilter getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(StringFilter iconUrl) {
        this.iconUrl = iconUrl;
    }

    public IntegerFilter getDefaultOrderId() {
        return defaultOrderId;
    }

    public void setDefaultOrderId(IntegerFilter defaultOrderId) {
        this.defaultOrderId = defaultOrderId;
    }

    public StringFilter getRegions() {
        return regions;
    }

    public void setRegions(StringFilter regions) {
        this.regions = regions;
    }

    public StringFilter getTags() {
        return tags;
    }

    public void setTags(StringFilter tags) {
        this.tags = tags;
    }

    public ZonedDateTimeFilter getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(ZonedDateTimeFilter addedDate) {
        this.addedDate = addedDate;
    }

    public ZonedDateTimeFilter getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(ZonedDateTimeFilter updatedDate) {
        this.updatedDate = updatedDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CategoryCriteria that = (CategoryCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(uuid, that.uuid) &&
            Objects.equals(name, that.name) &&
            Objects.equals(enabled, that.enabled) &&
            Objects.equals(parentCategoryId, that.parentCategoryId) &&
            Objects.equals(mcc, that.mcc) &&
            Objects.equals(iconUrl, that.iconUrl) &&
            Objects.equals(defaultOrderId, that.defaultOrderId) &&
            Objects.equals(regions, that.regions) &&
            Objects.equals(tags, that.tags) &&
            Objects.equals(addedDate, that.addedDate) &&
            Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        uuid,
        name,
        enabled,
        parentCategoryId,
        mcc,
        iconUrl,
        defaultOrderId,
        regions,
        tags,
        addedDate,
        updatedDate
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CategoryCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (uuid != null ? "uuid=" + uuid + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (enabled != null ? "enabled=" + enabled + ", " : "") +
                (parentCategoryId != null ? "parentCategoryId=" + parentCategoryId + ", " : "") +
                (mcc != null ? "mcc=" + mcc + ", " : "") +
                (iconUrl != null ? "iconUrl=" + iconUrl + ", " : "") +
                (defaultOrderId != null ? "defaultOrderId=" + defaultOrderId + ", " : "") +
                (regions != null ? "regions=" + regions + ", " : "") +
                (tags != null ? "tags=" + tags + ", " : "") +
                (addedDate != null ? "addedDate=" + addedDate + ", " : "") +
                (updatedDate != null ? "updatedDate=" + updatedDate + ", " : "") +
            "}";
    }

}

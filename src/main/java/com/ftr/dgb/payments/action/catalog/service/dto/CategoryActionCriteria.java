package com.ftr.dgb.payments.action.catalog.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import com.ftr.dgb.payments.action.catalog.domain.enumeration.ActionType;
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
 * Criteria class for the {@link com.ftr.dgb.payments.action.catalog.domain.CategoryAction} entity. This class is used
 * in {@link com.ftr.dgb.payments.action.catalog.web.rest.CategoryActionResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /category-actions?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class CategoryActionCriteria implements Serializable, Criteria {
    /**
     * Class for filtering ActionType
     */
    public static class ActionTypeFilter extends Filter<ActionType> {

        public ActionTypeFilter() {
        }

        public ActionTypeFilter(ActionTypeFilter filter) {
            super(filter);
        }

        @Override
        public ActionTypeFilter copy() {
            return new ActionTypeFilter(this);
        }

    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private UUIDFilter uuid;

    private ActionTypeFilter actionType;

    private StringFilter name;

    private BooleanFilter enabled;

    private UUIDFilter categoryId;

    private StringFilter mcc;

    private IntegerFilter defaultOrderId;

    private StringFilter iconUrl;

    private StringFilter regions;

    private StringFilter tags;

    private StringFilter source;

    private StringFilter processId;

    private ZonedDateTimeFilter addedDate;

    private ZonedDateTimeFilter updatedDate;

    public CategoryActionCriteria() {
    }

    public CategoryActionCriteria(CategoryActionCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.uuid = other.uuid == null ? null : other.uuid.copy();
        this.actionType = other.actionType == null ? null : other.actionType.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.enabled = other.enabled == null ? null : other.enabled.copy();
        this.categoryId = other.categoryId == null ? null : other.categoryId.copy();
        this.mcc = other.mcc == null ? null : other.mcc.copy();
        this.defaultOrderId = other.defaultOrderId == null ? null : other.defaultOrderId.copy();
        this.iconUrl = other.iconUrl == null ? null : other.iconUrl.copy();
        this.regions = other.regions == null ? null : other.regions.copy();
        this.tags = other.tags == null ? null : other.tags.copy();
        this.source = other.source == null ? null : other.source.copy();
        this.processId = other.processId == null ? null : other.processId.copy();
        this.addedDate = other.addedDate == null ? null : other.addedDate.copy();
        this.updatedDate = other.updatedDate == null ? null : other.updatedDate.copy();
    }

    @Override
    public CategoryActionCriteria copy() {
        return new CategoryActionCriteria(this);
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

    public ActionTypeFilter getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeFilter actionType) {
        this.actionType = actionType;
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

    public UUIDFilter getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUIDFilter categoryId) {
        this.categoryId = categoryId;
    }

    public StringFilter getMcc() {
        return mcc;
    }

    public void setMcc(StringFilter mcc) {
        this.mcc = mcc;
    }

    public IntegerFilter getDefaultOrderId() {
        return defaultOrderId;
    }

    public void setDefaultOrderId(IntegerFilter defaultOrderId) {
        this.defaultOrderId = defaultOrderId;
    }

    public StringFilter getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(StringFilter iconUrl) {
        this.iconUrl = iconUrl;
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

    public StringFilter getSource() {
        return source;
    }

    public void setSource(StringFilter source) {
        this.source = source;
    }

    public StringFilter getProcessId() {
        return processId;
    }

    public void setProcessId(StringFilter processId) {
        this.processId = processId;
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
        final CategoryActionCriteria that = (CategoryActionCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(uuid, that.uuid) &&
            Objects.equals(actionType, that.actionType) &&
            Objects.equals(name, that.name) &&
            Objects.equals(enabled, that.enabled) &&
            Objects.equals(categoryId, that.categoryId) &&
            Objects.equals(mcc, that.mcc) &&
            Objects.equals(defaultOrderId, that.defaultOrderId) &&
            Objects.equals(iconUrl, that.iconUrl) &&
            Objects.equals(regions, that.regions) &&
            Objects.equals(tags, that.tags) &&
            Objects.equals(source, that.source) &&
            Objects.equals(processId, that.processId) &&
            Objects.equals(addedDate, that.addedDate) &&
            Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        uuid,
        actionType,
        name,
        enabled,
        categoryId,
        mcc,
        defaultOrderId,
        iconUrl,
        regions,
        tags,
        source,
        processId,
        addedDate,
        updatedDate
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CategoryActionCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (uuid != null ? "uuid=" + uuid + ", " : "") +
                (actionType != null ? "actionType=" + actionType + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (enabled != null ? "enabled=" + enabled + ", " : "") +
                (categoryId != null ? "categoryId=" + categoryId + ", " : "") +
                (mcc != null ? "mcc=" + mcc + ", " : "") +
                (defaultOrderId != null ? "defaultOrderId=" + defaultOrderId + ", " : "") +
                (iconUrl != null ? "iconUrl=" + iconUrl + ", " : "") +
                (regions != null ? "regions=" + regions + ", " : "") +
                (tags != null ? "tags=" + tags + ", " : "") +
                (source != null ? "source=" + source + ", " : "") +
                (processId != null ? "processId=" + processId + ", " : "") +
                (addedDate != null ? "addedDate=" + addedDate + ", " : "") +
                (updatedDate != null ? "updatedDate=" + updatedDate + ", " : "") +
            "}";
    }

}

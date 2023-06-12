package com.emids.springbatch.service.share;

import com.emids.springbatch.entity.CompanyShare;
import com.emids.springbatch.exception.share.ShareNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface ShareService {

    List<CompanyShare> getAllShares();

    Optional<CompanyShare> getShareByUUID(UUID shareId);

    void addShare(CompanyShare share);

    void deleteShare(CompanyShare share);

    void updateShare(UUID shareId, CompanyShare updatedShare);

    Optional<CompanyShare> getShareByName(String shareName);

    void updateShareByFields(UUID shareId, Map<String, Object> fields) throws ShareNotFoundException;

}

package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Creates a new account based on the provided CustomerDto object.
     *
     * @param customerDto CustomerDto object containing account details
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches account details based on the provided mobile number.
     *
     * @param mobileNumber Input mobile number
     * @return CustomerDto object containing account details
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates account details based on the provided CustomerDto object.
     *
     * @param customerDto CustomerDto object containing updated account details
     * @return boolean indicating if the account update was successful
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes account details based on the provided mobile number.
     *
     * @param mobileNumber Input mobile number
     * @return boolean indicating if the account deletion was successful
     */
    boolean deleteAccount(String mobileNumber);

}
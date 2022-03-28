# GitHub Action Directory

## Action Scripts

### feature.yml

- fetuer branch action
- run unit test

### develop.yml

- develop branch action
- run unit test
- run docker build
- run docker hub push

### main.yml

- main branch action
- run unit test
- run docker build
- run docker hub push
- run deploy in OCI

## GitHub Secret List

### Docker Hub

- DOCKERHUB_USERNAME: docker hub username
- DOCKERHUB_TOKEN: docker hub user access token

### OCI

- OCI_USER_OCID: OCI User account OCID
- OCI_FINGERPRINT: OCI User fingerprint
- OCI_TENANCY_OCID: OCI User tenancy
- OCI_REGION: OCI region
- OCI_KEY_FILE: OCI User Access key file
- OCI_INSTANCE_OCID: OCI instance ocid
- OCI_INSTANCE_SSH_KEY: OCI instance connect ssh key
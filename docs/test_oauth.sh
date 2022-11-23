#!/bin/bash
 curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'client_id=rossonet-console-test' -d 'client_secret=zHBxvPM8i6FDw6dwyCZWkKoRQ7k9q7uk' -d 'username=test' -d 'password=password123!' -d 'grant_type=password' 'https://auth.bottegaio.net/auth/realms/rossonet-test/protocol/openid-connect/token'
